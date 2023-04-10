package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoldLoan extends BaseClass{

	
//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}
	
	
	@Test
	public static void gold_Loan_Execution() {
		
		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_Gold_loan_button()).build().perform();
		
		WebElement GL_Landind_Page_Content = homepageLocators.getGL_Landing_Page_Content();

	 	wait.until(ExpectedConditions.visibilityOf(GL_Landind_Page_Content));

		String GL_Landind_Page_Content_text = GL_Landind_Page_Content.getText();

		System.out.println(GL_Landind_Page_Content_text);

		if (displayed(GL_Landind_Page_Content) || GL_Landind_Page_Content_text.matches("Quick Money for Gold Highest per gram rate with Shriram Gold Loan")) {

			System.out.println("Gold loan flow is working fine");

		} else {

			System.out.println("Gold loan flow isn't working");

		}

	}
		
		
	}

