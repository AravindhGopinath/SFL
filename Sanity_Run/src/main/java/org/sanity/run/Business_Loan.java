package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Business_Loan extends BaseClass{

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void business_Loan_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_Business_Loan_button()).build().perform();
		
		WebElement Business_Loan_Landing_Page_Content = homepageLocators.getBusiness_Loan_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Business_Loan_Landing_Page_Content));

		String Business_Loan_Landing_Page_Content_text = Business_Loan_Landing_Page_Content.getText();

		System.out.println(Business_Loan_Landing_Page_Content_text);

		if (displayed(Business_Loan_Landing_Page_Content) || Business_Loan_Landing_Page_Content_text
				.matches("Funds for all your Business Needs")) {

			System.out.println("Business Loan flow is working fine");

		} else {

			System.out.println("Business Loan flow isn't working");

		}

		
		
}
}
