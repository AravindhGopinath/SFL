package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FD_Sanity extends BaseClass {

	public static void fdExecution() {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getDeposits_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_FD_button()).build().perform();

		WebElement fd_Landind_Page_Content = homepageLocators.getFD_Landing_Page_Content();

		wait.until(ExpectedConditions.visibilityOf(fd_Landind_Page_Content));

		String fd_Landind_Page_Content_text = fd_Landind_Page_Content.getText();

		System.out.println(fd_Landind_Page_Content_text);

		if (displayed(fd_Landind_Page_Content)
				|| fd_Landind_Page_Content_text.matches("Secure your future today FD rates as high as 9.05%* p.a.")) {

			System.out.println("FD flow is working fine");

		} else {

			System.out.println("FD flow isn't working");
		}

	}
}
