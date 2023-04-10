package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Passenger_Commercial_Vehicle_Finance extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void passenger_Commercial_Vehicle_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Passenger_Commercial_Vehicle_Finance_button()).build().perform();

		WebElement Passenger_Commercial_Vehicle_Finance_Landing_Page_Content = homepageLocators
				.getPassenger_Commercial_Vehicle_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Passenger_Commercial_Vehicle_Finance_Landing_Page_Content));

		String Passenger_Commercial_Vehicle_Finance_Landing_Page_Content_text = Passenger_Commercial_Vehicle_Finance_Landing_Page_Content
				.getText();

		System.out.println(Passenger_Commercial_Vehicle_Finance_Landing_Page_Content_text);

		if (displayed(Passenger_Commercial_Vehicle_Finance_Landing_Page_Content)
				|| Passenger_Commercial_Vehicle_Finance_Landing_Page_Content_text.matches(
						"Scale your business with affordable passenger vehicle loans ")) {

			System.out.println("Passenger Commercial vehicle finance flow is working fine");

		} else {

			System.out.println("Passenger Commercial vehicle finance flow isn't working");

		}

	}
}