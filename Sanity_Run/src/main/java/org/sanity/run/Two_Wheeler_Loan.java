package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Two_Wheeler_Loan extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void two_Wheeler_Loan_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Two_Wheeler_loan_button()).build().perform();

		WebElement tw_Landind_Page_Content = homepageLocators.getTW_Landing_Page_Content();

	 	wait.until(ExpectedConditions.visibilityOf(tw_Landind_Page_Content));

		String tw_Landind_Page_Content_text = tw_Landind_Page_Content.getText();

		System.out.println(tw_Landind_Page_Content_text);

		if (displayed(tw_Landind_Page_Content) || tw_Landind_Page_Content_text.matches("Getting a two-wheeler loan is easy & hassle-free")) {

			System.out.println("Two wheeler flow is working fine");

		} else {

			System.out.println("Two wheeler flow isn't working");

		}

	}

}
