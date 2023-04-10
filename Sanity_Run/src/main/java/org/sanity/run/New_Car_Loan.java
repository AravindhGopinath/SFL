package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New_Car_Loan extends BaseClass{

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}
	
	
	@Test
	public static void new_car_Loan_Execution() {
		
		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_New_Car_loan_button()).build().perform();
		
		WebElement new_Car_Loan_Landind_Page_Content = homepageLocators.getNew_Car_Loan_Landing_Page_Content();
		
		wait.until(ExpectedConditions.visibilityOf(new_Car_Loan_Landind_Page_Content));

		String new_Car_Loan_Landind_Page_Content_text = new_Car_Loan_Landind_Page_Content.getText();

		System.out.println(new_Car_Loan_Landind_Page_Content_text);

		if (displayed(new_Car_Loan_Landind_Page_Content) || new_Car_Loan_Landind_Page_Content_text.matches("Better journeys, starting today With Shriram New Car Loans")) {

			System.out.println("New Car loan flow is working fine");

		} else {

			System.out.println("New Car loan flow isn't working");

		}

	}
}
