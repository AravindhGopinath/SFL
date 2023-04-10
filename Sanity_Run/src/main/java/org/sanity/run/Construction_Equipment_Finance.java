package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Construction_Equipment_Finance extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void construction_Equipment_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Construction_Equipment_Finance_button()).build().perform();

		WebElement Construction_Equipment_Finance_Landing_Page_Content = homepageLocators
				.getConstruction_Equipment_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Construction_Equipment_Finance_Landing_Page_Content));

		String Construction_Equipment_Finance_Landing_Page_Content_text = Construction_Equipment_Finance_Landing_Page_Content
				.getText();

		System.out.println(Construction_Equipment_Finance_Landing_Page_Content_text);

		if (displayed(Construction_Equipment_Finance_Landing_Page_Content)
				|| Construction_Equipment_Finance_Landing_Page_Content_text.matches(
						"Get customised Construction Equipment Loan")) {

			System.out.println("Construction Equipment finance flow is working fine");

		} else {

			System.out.println("Construction Equipment finance flow isn't working");

		}

	}
}
