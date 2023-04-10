package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tax_Finance extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void tax_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Tax_Finance_button()).build().perform();

		WebElement Tax_Finance_Landing_Page_Content = homepageLocators.getTax_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Tax_Finance_Landing_Page_Content));

		String Tax_Finance_Landing_Page_Content_text = Tax_Finance_Landing_Page_Content.getText();

		System.out.println(Tax_Finance_Landing_Page_Content_text);

		if (displayed(Tax_Finance_Landing_Page_Content) || Tax_Finance_Landing_Page_Content_text
				.matches("Get quick loan to pay your business taxes with Shriram Tax Finance")) {

			System.out.println("Tax Finance flow is working fine");

		} else {

			System.out.println("Tax Finance flow isn't working");

		}

	}
}
