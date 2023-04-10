package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Commercial_Vehicle_Loan extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void commercial_Vehicle_Loan_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Commercial_Vehicle_loan_button()).build().perform();

		WebElement Commercial_Vehicle_Loan_Landing_Page_Content = homepageLocators
				.getCommercial_Vehicle_Loan_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Commercial_Vehicle_Loan_Landing_Page_Content));

		String Commercial_Vehicle_Loan_Landing_Page_Content_text = Commercial_Vehicle_Loan_Landing_Page_Content
				.getText();

		System.out.println(Commercial_Vehicle_Loan_Landing_Page_Content_text);
		
		

		if (displayed(Commercial_Vehicle_Loan_Landing_Page_Content) || Commercial_Vehicle_Loan_Landing_Page_Content_text
				.matches("Shriram Commercial Vehicle Loans ")) {

			System.out.println("Commercial vehicle loan flow is working fine");

		} else {

			System.out.println("Commercial vehicle loan flow isn't working");

		}

	}
}
