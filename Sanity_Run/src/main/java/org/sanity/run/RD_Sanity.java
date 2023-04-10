package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RD_Sanity extends BaseClass {

	public static void rdExecution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getDeposits_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_RD_button()).build().perform();

		WebElement rd_Landind_Page_Content = homepageLocators.getRD_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(rd_Landind_Page_Content));

		String rd_Landind_Page_Content_text = rd_Landind_Page_Content.getText();

		System.out.println(rd_Landind_Page_Content_text);

		if (displayed(rd_Landind_Page_Content) || rd_Landind_Page_Content_text.matches("Grow your hard earned savings")) {

			System.out.println("RD flow is working fine");

		} else {

			System.out.println("RD flow isn't working");
		}

	}
}
