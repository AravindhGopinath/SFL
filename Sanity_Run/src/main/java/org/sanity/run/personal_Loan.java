package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class personal_Loan extends BaseClass {
	
//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}
	
	
	@Test
	public static void personal_Loan_Execution() {
		
		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_Personal_loan_button()).build().perform();
		
		WebElement PL_Landind_Page_Content = homepageLocators.getPL_Landing_Page_Content();

	 	wait.until(ExpectedConditions.visibilityOf(PL_Landind_Page_Content));

		String PL_Landind_Page_Content_text = PL_Landind_Page_Content.getText();

		System.out.println(PL_Landind_Page_Content_text);

		if (displayed(PL_Landind_Page_Content) || PL_Landind_Page_Content_text.matches("Getting a personal loan is easy & hassle-free")) {

			System.out.println("Personal loan flow is working fine");

		} else {

			System.out.println("Personal loan flow isn't working");

		}
		
		
	}

	
}
