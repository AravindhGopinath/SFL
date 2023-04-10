package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Commercial_Goods_Vehicle_Finance extends BaseClass {

//	@BeforeTest
//	public void browserLaunch() {
//
//		launchBrowser("chrome");
//		loadUrl("https://beta.shriram.com/");
//	}

	@Test
	public static void commercial_goods_Vehicle_Finance_Execution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getLoans_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_Commercial_Goods_Vehicle_Finance_button()).build().perform();

		WebElement Commercial_Goods_Vehicle_Finance_Landing_Page_Content = homepageLocators
				.getCommercial_Goods_Vehicle_Finance_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(Commercial_Goods_Vehicle_Finance_Landing_Page_Content));

		String Commercial_Goods_Vehicle_Finance_Landing_Page_Content_text = Commercial_Goods_Vehicle_Finance_Landing_Page_Content
				.getText();

		System.out.println(Commercial_Goods_Vehicle_Finance_Landing_Page_Content_text);

		if (displayed(Commercial_Goods_Vehicle_Finance_Landing_Page_Content)
				|| Commercial_Goods_Vehicle_Finance_Landing_Page_Content_text
						.matches("Grow your business with Commercial Goods Vehicle Finance ")) {

			System.out.println("Commercial goods vehicle finance flow is working fine");

		} else {

			System.out.println("Commercial goods vehicle finance flow isn't working");

		}

	}

}
