
package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_Capital_Loans extends BaseClass {

	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
		loadUrl("https://beta.shriram.com/");
	}

	@Test
	public static void working_Capital_Loans_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Working_Capital_loan_button()).build().perform();

		WebElement Working_Capital_Loans_Landing_Page_Content = homepageLocators
				.getWorking_Capital_Loans_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Working_Capital_Loans_Landing_Page_Content));

		String Working_Capital_Loans_Landing_Page_Content_text = Working_Capital_Loans_Landing_Page_Content.getText();

		System.out.println(Working_Capital_Loans_Landing_Page_Content_text);

		if (displayed(Working_Capital_Loans_Landing_Page_Content) || Working_Capital_Loans_Landing_Page_Content_text
				.matches("Stay business ready with Shriram Working Capital Loans")) {

			System.out.println("Working Capital Loans flow is working fine");

		} else {

			System.out.println("Working Capital Loans flow isn't working");

		}

	}
}