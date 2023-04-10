package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fuel_Finance extends BaseClass{

	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
		loadUrl("https://beta.shriram.com/");
	}

	@Test
	public static void fuel_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_Fuel_Finance_button()).build().perform();
		
		WebElement Fuel_Finance_Landing_Page_Content = homepageLocators.getFuel_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Fuel_Finance_Landing_Page_Content));

		String Fuel_Finance_Landing_Page_Content_text = Fuel_Finance_Landing_Page_Content.getText();

		System.out.println(Fuel_Finance_Landing_Page_Content_text);

		if (displayed(Fuel_Finance_Landing_Page_Content) || Fuel_Finance_Landing_Page_Content_text
				.matches("Get quick loan to manage your mounting fuel expenses with Shriram Fuel Finance")) {

			System.out.println("Fuel Finance flow is working fine");

		} else {

			System.out.println("Fuel Finance flow isn't working");

		}

		
	
}
}