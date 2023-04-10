package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pay_Loan_EMI extends BaseClass{
	
//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void pay_Loan_EMI_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getPay_Online_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_Pay_Loan_Emi_button()).build().perform();
		
		WebElement Loan_EMI_Payment_Landing_Page_Content = homepageLocators.getLoan_EMI_Payment_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Loan_EMI_Payment_Landing_Page_Content));

		String Loan_EMI_Payment_Landing_Page_Content_text = Loan_EMI_Payment_Landing_Page_Content.getText();

		System.out.println(Loan_EMI_Payment_Landing_Page_Content_text);

		if (displayed(Loan_EMI_Payment_Landing_Page_Content) || Loan_EMI_Payment_Landing_Page_Content_text
				.matches("Loan EMI Payment")) {

			System.out.println("Pay Loan EMI flow is working fine");

		} else {

			System.out.println("Pay Loan EMI flow isn't working");

		}



		
	
	
}	
}
