package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sanity_Run extends BaseClass {

	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
		loadUrl("https://beta.shriram.com/");
	}

	@AfterTest
	public void browserQuit() {

		driver.quit();

	}
	
	String what_to_run ="FD";

	@Test
	private void sanity_Run() {
		
		if (what_to_run=="FD") {
			
			FD_Sanity.fdExecution();
			
		} else {

		}

}
}
