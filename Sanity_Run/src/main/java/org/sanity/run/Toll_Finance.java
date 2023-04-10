package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Toll_Finance extends BaseClass{

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void toll_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_Toll_Finance_button()).build().perform();
		
		WebElement Toll_Finance_Landing_Page_Content = homepageLocators.getToll_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Toll_Finance_Landing_Page_Content));

		String Toll_Finance_Landing_Page_Content_text = Toll_Finance_Landing_Page_Content.getText();

		System.out.println(Toll_Finance_Landing_Page_Content_text);

		if (displayed(Toll_Finance_Landing_Page_Content) || Toll_Finance_Landing_Page_Content_text
				.matches("Drive past tolls seamlessly with the most affordable Shriram Toll Finance")) {

			System.out.println("Toll Finance flow is working fine");

		} else {

			System.out.println("Toll Finance flow isn't working");

		}

	
}
}
