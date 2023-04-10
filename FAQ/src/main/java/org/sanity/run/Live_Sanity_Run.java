
package org.sanity.run;

import java.time.Duration;

import org.base.BaseClass;
import org.loactors.PreLogin_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Live_Sanity_Run extends BaseClass {

	static WebDriverWait Webwait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@Test
	public static void PreLoginExecution() {

		PreLogin_Locators prelogin = new PreLogin_Locators();

		loadUrl("https://secure.shriramfinance.in/");

		try {
			WebElement mobile_No = prelogin.getMobile_No();

			mobile_No.click();

			mobile_No.sendKeys("8508888860");

			WebElement mpin = prelogin.getMpin();

			mpin.click();

			mpin.sendKeys("7598");

			prelogin.getSecure_login_submit_button().click();

			prelogin.getOTP_Verify_Button().click();

			WebElement dashboard_text = prelogin.getDashboard_text();

			Webwait.until(ExpectedConditions.visibilityOf(dashboard_text));

			if (dashboard_text.isDisplayed()) {

				System.out.println("User logged in Successfully");

			} else {

				System.out.println("User can't login");

			}

		} catch (Exception e) {

			System.out.println(e + " ==> Prelogin exception");
		}

	}

}
