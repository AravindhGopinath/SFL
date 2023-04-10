package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RD_Installment_Pay extends BaseClass{

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void rd_Installment_Pay_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getPay_Online_Accordian()).build().perform();
		
		act.click(homepageLocators.getHomepage_RD_Installment_Pay_button()).build().perform();
		
		WebElement RD_Installment_Pay_Landing_Page_Content = homepageLocators.getRD_Installment_Pay_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(RD_Installment_Pay_Landing_Page_Content));

		String RD_Installment_Pay_Landing_Page_Content_text = RD_Installment_Pay_Landing_Page_Content.getText();

		System.out.println(RD_Installment_Pay_Landing_Page_Content_text);

		if (displayed(RD_Installment_Pay_Landing_Page_Content) || RD_Installment_Pay_Landing_Page_Content_text
				.matches("Recurring Deposit Instalment Payment")) {

			System.out.println("RD Installment Pay flow is working fine");

		} else {

			System.out.println("RD Installment Pay flow isn't working");

		}

		



}
}
