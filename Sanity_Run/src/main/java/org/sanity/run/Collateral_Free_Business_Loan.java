package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Collateral_Free_Business_Loan extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void collateral_Free_Business_Loan_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Collateral_Free_Business_Loan_button()).build().perform();

		WebElement Collateral_Free_Business_Loan_Landing_Page_Content = homepageLocators
				.getCollateral_Free_Business_Loan_Landing_Page_Content();

		WebElement Collateral_Free_Business_Loan_2_Landing_Page_Content = homepageLocators
				.getCollateral_Free_Business_Loan_2_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Collateral_Free_Business_Loan_2_Landing_Page_Content));

		String Collateral_Free_Business_Loan_Landing_Page_Content_text = Collateral_Free_Business_Loan_Landing_Page_Content
				.getText();

		String Collateral_Free_Business_Loan_2_Landing_Page_Content_text = Collateral_Free_Business_Loan_2_Landing_Page_Content
				.getText();

		System.out.println(Collateral_Free_Business_Loan_Landing_Page_Content_text);

		System.out.println(Collateral_Free_Business_Loan_2_Landing_Page_Content_text);

		if (displayed(Collateral_Free_Business_Loan_Landing_Page_Content)
				|| displayed(Collateral_Free_Business_Loan_2_Landing_Page_Content)
				|| Collateral_Free_Business_Loan_2_Landing_Page_Content_text.matches("Zero Collateral")
				|| Collateral_Free_Business_Loan_Landing_Page_Content_text
						.matches("Do you have business registration proof?")) {

			System.out.println("Collateral Free Business Loan flow is working fine");

		} else {

			System.out.println("Collateral Free Business Loan flow isn't working");

		}

	}
}
