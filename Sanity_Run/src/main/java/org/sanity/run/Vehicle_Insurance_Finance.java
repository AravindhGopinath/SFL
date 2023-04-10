package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vehicle_Insurance_Finance extends BaseClass {

	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
		loadUrl("https://beta.shriram.com/");
	}

	@Test
	public static void vehicle_Insurance_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Vehicle_Insurance_Finance_button()).build().perform();

		WebElement Vehicle_Insurance_Finance_Landing_Page_Content = homepageLocators
				.getVehicle_Insurance_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Vehicle_Insurance_Finance_Landing_Page_Content));

		String Vehicle_Insurance_Finance_Landing_Page_Content_text = Vehicle_Insurance_Finance_Landing_Page_Content
				.getText();

		System.out.println(Vehicle_Insurance_Finance_Landing_Page_Content_text);

		if (displayed(Vehicle_Insurance_Finance_Landing_Page_Content)
				|| Vehicle_Insurance_Finance_Landing_Page_Content_text
						.matches("Get easy loan to pay off your Vehicle Insurance with Shriram Vehicle Insurance Finance")) {

			System.out.println("Vehicle Insurance Finance flow is working fine");

		} else {

			System.out.println("Vehicle Insurance Finance flow isn't working");

		}

	}
}
