package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tractor_And_Farm_Equipment_Finance extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void tractor_And_Farm_Equipment_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Tractor_and_Farm_Equipment_Finance_button()).build().perform();

		WebElement Tractor_And_Farm_Equipment_Finance_Landing_Page_Content = homepageLocators
				.getTractor_And_Farm_Equipment_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Tractor_And_Farm_Equipment_Finance_Landing_Page_Content));

		String Tractor_And_Farm_Equipment_Finance_Landing_Page_Content_text = Tractor_And_Farm_Equipment_Finance_Landing_Page_Content
				.getText();

		System.out.println(Tractor_And_Farm_Equipment_Finance_Landing_Page_Content_text);

		if (displayed(Tractor_And_Farm_Equipment_Finance_Landing_Page_Content)
				|| Tractor_And_Farm_Equipment_Finance_Landing_Page_Content_text.matches(
						"Get Affordable Tractor and Farm Equipment Finance ")) {

			System.out.println("Tractor And Farm Equipment finance flow is working fine");

		} else {

			System.out.println("Tractor And Farm Equipment finance flow isn't working");

		}

	}
}