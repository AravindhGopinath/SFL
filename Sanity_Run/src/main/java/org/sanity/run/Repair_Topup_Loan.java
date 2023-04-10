package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Repair_Topup_Loan extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void repair_Topup_Loan_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Repair_Topup_Loan_button()).build().perform();

		WebElement Repair_Topup_Loan_Landing_Page_Content = homepageLocators
				.getRepair_Topup_Loan_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Repair_Topup_Loan_Landing_Page_Content));

		String Repair_Topup_Loan_Landing_Page_Content_text = Repair_Topup_Loan_Landing_Page_Content.getText();

		System.out.println(Repair_Topup_Loan_Landing_Page_Content_text);

		if (displayed(Repair_Topup_Loan_Landing_Page_Content) || Repair_Topup_Loan_Landing_Page_Content_text
				.matches("Manage your unforeseen business expenses with Shriram Repair/Top-Up Loan.")) {

			System.out.println("Repair Topup loan flow is working fine");

		} else {

			System.out.println("Repair Topup loan flow isn't working");

		}

	}
}