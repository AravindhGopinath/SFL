package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tyre_Finance extends BaseClass{

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void tyre_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Tyre_Finance_button()).build().perform();
		
		WebElement Tyre_Finance_Landing_Page_Content = homepageLocators
				.getTyre_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Tyre_Finance_Landing_Page_Content));

		String Tyre_Finance_Landing_Page_Content_text = Tyre_Finance_Landing_Page_Content
				.getText();

		System.out.println(Tyre_Finance_Landing_Page_Content_text);

		if (displayed(Tyre_Finance_Landing_Page_Content)
				|| Tyre_Finance_Landing_Page_Content_text
						.matches("Ensure uninterrupted running of your vehicles with a Tyre Loan from Shriram Finance")) {

			System.out.println("Tyre Finance flow is working fine");

		} else {

			System.out.println("Tyre Finance flow isn't working");

		}

		
	
	
	
}
}
