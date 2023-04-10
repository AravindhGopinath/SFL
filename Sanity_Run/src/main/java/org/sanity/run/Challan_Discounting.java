package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Challan_Discounting extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void challan_Discounting_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_Challan_Discounting_button()).build().perform();
		
		WebElement Challan_Discounting_Landing_Page_Content = homepageLocators.getChallan_Discounting_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Challan_Discounting_Landing_Page_Content));

		String Challan_Discounting_Landing_Page_Content_text = Challan_Discounting_Landing_Page_Content.getText();

		System.out.println(Challan_Discounting_Landing_Page_Content_text);

		if (displayed(Challan_Discounting_Landing_Page_Content) || Challan_Discounting_Landing_Page_Content_text
				.matches("Keep your Vehicle Running with affordable Shriram Challan Discounting Loans")) {

			System.out.println("Challan discounting flow is working fine");

		} else {

			System.out.println("Challan discounting flow isn't working");

		}

		
		
	
}
}