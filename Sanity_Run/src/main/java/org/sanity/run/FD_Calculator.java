package org.sanity.run;

import org.base.BaseClass;
import org.loactors.Homepage_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FD_Calculator extends BaseClass {

	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
		loadUrl("https://beta.shriram.com/");
	}

	@Test
	public static void fd_Calculator_Execution() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 25);

		Homepage_Locators homepageLocators = new Homepage_Locators();

		Actions act = new Actions(driver);

		act.moveToElement(homepageLocators.getCalcualtor_Accordian()).build().perform();

		act.click(homepageLocators.getHomepage_FD_Calculator_button()).build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(homepageLocators.getFD_Calculator_fd_calc_tab()));

		act.moveToElement(homepageLocators.getFD_Calculator_fd_calc_tab()).build().perform();

		hold(2000);

		act.moveToElement(homepageLocators.getFD_Calculator_Interest_payout_term_dropdown()).build().perform();

		WebElement fd_Calculator_Maturity_Value = homepageLocators.getFD_Calculator_Maturity_Value();

		hold(2000);

		String Onload_fd_Calculator_Maturity_Value = fd_Calculator_Maturity_Value.getText();

		String Onload_fd_Calculator_Maturity_Valuee = Onload_fd_Calculator_Maturity_Value.replaceAll("[₹ ,]", "");

		int parseInt_Onload_fd_Calculator_Maturity_Valuee = Integer.parseInt(Onload_fd_Calculator_Maturity_Valuee);

		System.out.println(parseInt_Onload_fd_Calculator_Maturity_Valuee);

		WebElement fd_Calculator_Investment_Amount_Textbox = homepageLocators
				.getFD_Calculator_Investment_Amount_Textbox();

		act.doubleClick(fd_Calculator_Investment_Amount_Textbox).build().perform();

		act.sendKeys(fd_Calculator_Investment_Amount_Textbox, Keys.CLEAR);

		fd_Calculator_Investment_Amount_Textbox.sendKeys(Keys.BACK_SPACE);

		fd_Calculator_Investment_Amount_Textbox.sendKeys("50000");

		fd_Calculator_Investment_Amount_Textbox.sendKeys(Keys.ENTER);

		homepageLocators.getFD_Calculator_step_03().click();

		hold(2000);

		String Postchange_fd_Calculator_Maturity_Value = fd_Calculator_Maturity_Value.getText();

		String Postchange_fd_Calculator_Maturity_Valuee = Postchange_fd_Calculator_Maturity_Value.replaceAll("[₹ ,]",
				"");

		int parseInt_Postchange_fd_Calculator_Maturity_Valuee = Integer
				.parseInt(Postchange_fd_Calculator_Maturity_Valuee);

		System.out.println(parseInt_Postchange_fd_Calculator_Maturity_Valuee);

		act.doubleClick(fd_Calculator_Investment_Amount_Textbox).build().perform();

		act.sendKeys(fd_Calculator_Investment_Amount_Textbox, Keys.CLEAR);

		fd_Calculator_Investment_Amount_Textbox.sendKeys(Keys.BACK_SPACE);

		fd_Calculator_Investment_Amount_Textbox.sendKeys("5000");

		fd_Calculator_Investment_Amount_Textbox.sendKeys(Keys.ENTER);

		homepageLocators.getFD_Calculator_step_03().click();

		hold(2000);

		String revert_change_fd_Calculator_Maturity_Value = fd_Calculator_Maturity_Value.getText();

		String revert_change_fd_Calculator_Maturity_Valuee = revert_change_fd_Calculator_Maturity_Value
				.replaceAll("[₹ ,]", "");

		int parseInt_revert_change_fd_Calculator_Maturity_Valuee = Integer
				.parseInt(revert_change_fd_Calculator_Maturity_Valuee);

		System.out.println(parseInt_revert_change_fd_Calculator_Maturity_Valuee);

		if (parseInt_Onload_fd_Calculator_Maturity_Valuee != parseInt_Postchange_fd_Calculator_Maturity_Valuee
				&& parseInt_Onload_fd_Calculator_Maturity_Valuee == parseInt_revert_change_fd_Calculator_Maturity_Valuee) {

			System.out.println("Fixed deposit calculator's invest amount field is working fine");

		} else {

			System.out.println("Fixed deposit calculator's invest amount field isn't working ");
		}

//*********************************************************************_Tenure_**************************************************************************************		

		WebElement fd_Calculator_Maturity_Value1 = homepageLocators.getFD_Calculator_Maturity_Value();

		hold(2000);

		String Onload_fd_Calculator_Maturity_Value1 = fd_Calculator_Maturity_Value1.getText();

		String Onload_fd_Calculator_Maturity_Valuee1 = Onload_fd_Calculator_Maturity_Value1.replaceAll("[₹ ,]", "");

		int parseInt_Onload_fd_Calculator_Maturity_Valuee1 = Integer.parseInt(Onload_fd_Calculator_Maturity_Valuee1);

		System.out.println(parseInt_Onload_fd_Calculator_Maturity_Valuee1);

		WebElement FD_Calculator_Tenure_Textbox = homepageLocators.getFD_Calculator_Tenure_Textbox();

		act.doubleClick(FD_Calculator_Tenure_Textbox).build().perform();

		act.sendKeys(FD_Calculator_Tenure_Textbox, Keys.CLEAR);

		FD_Calculator_Tenure_Textbox.sendKeys(Keys.BACK_SPACE);

		FD_Calculator_Tenure_Textbox.sendKeys("48");

		FD_Calculator_Tenure_Textbox.sendKeys(Keys.ENTER);

		homepageLocators.getFD_Calculator_step_03().click();

		hold(2000);

		String Postchange_fd_Calculator_Maturity_Value1 = fd_Calculator_Maturity_Value.getText();

		String Postchange_fd_Calculator_Maturity_Valuee1 = Postchange_fd_Calculator_Maturity_Value1.replaceAll("[₹ ,]",
				"");

		int parseInt_Postchange_fd_Calculator_Maturity_Valuee1 = Integer
				.parseInt(Postchange_fd_Calculator_Maturity_Valuee1);

		System.out.println(parseInt_Postchange_fd_Calculator_Maturity_Valuee1);

		act.doubleClick(FD_Calculator_Tenure_Textbox).build().perform();

		act.sendKeys(FD_Calculator_Tenure_Textbox, Keys.CLEAR);

		FD_Calculator_Tenure_Textbox.sendKeys(Keys.BACK_SPACE);

		FD_Calculator_Tenure_Textbox.sendKeys("12");

		FD_Calculator_Tenure_Textbox.sendKeys(Keys.ENTER);

		homepageLocators.getFD_Calculator_step_03().click();

		hold(2000);

		String revert_change_fd_Calculator_Maturity_Value1 = fd_Calculator_Maturity_Value.getText();

		String revert_change_fd_Calculator_Maturity_Valuee1 = revert_change_fd_Calculator_Maturity_Value1
				.replaceAll("[₹ ,]", "");

		int parseInt_revert_change_fd_Calculator_Maturity_Valuee1 = Integer
				.parseInt(revert_change_fd_Calculator_Maturity_Valuee1);

		System.out.println(parseInt_revert_change_fd_Calculator_Maturity_Valuee1);

		if (parseInt_Onload_fd_Calculator_Maturity_Valuee1 != parseInt_Postchange_fd_Calculator_Maturity_Valuee1
				&& parseInt_Onload_fd_Calculator_Maturity_Valuee1 == parseInt_revert_change_fd_Calculator_Maturity_Valuee1) {

			System.out.println("Fixed deposit calculator's tenure field is working fine");

		} else {

			System.out.println("Fixed deposit calculator's tenure field isn't working ");
		}

//*************************************************************_I'm a senior citizen radio button_**************************************************************************************		

		WebElement fd_Calculator_Maturity_Value2 = homepageLocators.getFD_Calculator_Maturity_Value();

		hold(2000);

		String Onload_fd_Calculator_Maturity_Value2 = fd_Calculator_Maturity_Value2.getText();

		String Onload_fd_Calculator_Maturity_Valuee2 = Onload_fd_Calculator_Maturity_Value2.replaceAll("[₹ ,]", "");

		int parseInt_Onload_fd_Calculator_Maturity_Valuee2 = Integer.parseInt(Onload_fd_Calculator_Maturity_Valuee2);

		System.out.println(parseInt_Onload_fd_Calculator_Maturity_Valuee2);

		String firstCondition = "Yes";

		if (firstCondition.equalsIgnoreCase("Yes")) {

			homepageLocators.getFD_Calculator_Iam_a_Senior_Citizen_Radio_Yes_Button().click();

		} else {

			homepageLocators.getFD_Calculator_Iam_a_Senior_Citizen_Radio_No_Button().click();

		}

		hold(2000);

		String Postchange_fd_Calculator_Maturity_Value2 = fd_Calculator_Maturity_Value2.getText();

		String Postchange_fd_Calculator_Maturity_Valuee2 = Postchange_fd_Calculator_Maturity_Value2.replaceAll("[₹ ,]",
				"");

		int parseInt_Postchange_fd_Calculator_Maturity_Valuee2 = Integer
				.parseInt(Postchange_fd_Calculator_Maturity_Valuee2);

		System.out.println(parseInt_Postchange_fd_Calculator_Maturity_Valuee2);

		String secondCondition = "No";

		if (secondCondition.equalsIgnoreCase("No")) {

			homepageLocators.getFD_Calculator_Iam_a_Senior_Citizen_Radio_No_Button().click();


		} else {

			homepageLocators.getFD_Calculator_Iam_a_Senior_Citizen_Radio_Yes_Button().click();

		}
		
		hold(2000);

		String revert_change_fd_Calculator_Maturity_Value3 = fd_Calculator_Maturity_Value.getText();

		String revert_change_fd_Calculator_Maturity_Valuee3 = revert_change_fd_Calculator_Maturity_Value3
				.replaceAll("[₹ ,]", "");

		int parseInt_revert_change_fd_Calculator_Maturity_Valuee3 = Integer
				.parseInt(revert_change_fd_Calculator_Maturity_Valuee3);

		System.out.println(parseInt_revert_change_fd_Calculator_Maturity_Valuee3);

		if (parseInt_Onload_fd_Calculator_Maturity_Valuee2 != parseInt_Postchange_fd_Calculator_Maturity_Valuee2
				&& parseInt_Onload_fd_Calculator_Maturity_Valuee2 == parseInt_revert_change_fd_Calculator_Maturity_Valuee3) {

			System.out.println("Fixed deposit calculator's I am a Senior Citizen radio button is working fine");

		} else {

			System.out.println("Fixed deposit calculator's I am a Senior Citizen radio button isn't working ");
		}

		

//*************************************************************_I'm a Woman radio button_**************************************************************************************		
		
		
		WebElement fd_Calculator_Maturity_Value22 = homepageLocators.getFD_Calculator_Maturity_Value();

		hold(2000);

		String Onload_fd_Calculator_Maturity_Value22 = fd_Calculator_Maturity_Value22.getText();

		String Onload_fd_Calculator_Maturity_Valuee22 = Onload_fd_Calculator_Maturity_Value22.replaceAll("[₹ ,]", "");

		int parseInt_Onload_fd_Calculator_Maturity_Valuee22 = Integer.parseInt(Onload_fd_Calculator_Maturity_Valuee22);

		System.out.println(parseInt_Onload_fd_Calculator_Maturity_Valuee22);

		String firstCondition1 = "Yes";

		if (firstCondition1.equalsIgnoreCase("Yes")) {

			homepageLocators.getFD_Calculator_Iam_a_Woman_Yes_button().click();

		} else {

			homepageLocators.getFD_Calculator_Iam_a_Woman_Radio_No_Button().click();

		}

		hold(2000);

		String Postchange_fd_Calculator_Maturity_Value22 = fd_Calculator_Maturity_Value.getText();

		String Postchange_fd_Calculator_Maturity_Valuee22 = Postchange_fd_Calculator_Maturity_Value22.replaceAll("[₹ ,]",
				"");

		int parseInt_Postchange_fd_Calculator_Maturity_Valuee22 = Integer
				.parseInt(Postchange_fd_Calculator_Maturity_Valuee22);

		System.out.println(parseInt_Postchange_fd_Calculator_Maturity_Valuee22);

		String secondCondition2 = "No";

		if (secondCondition2.equalsIgnoreCase("No")) {

			homepageLocators.getFD_Calculator_Iam_a_Woman_Radio_No_Button().click();


		} else {

			homepageLocators.getFD_Calculator_Iam_a_Woman_Yes_button().click();

		}
		
		hold(2000);

		String revert_change_fd_Calculator_Maturity_Value33 = fd_Calculator_Maturity_Value.getText();

		String revert_change_fd_Calculator_Maturity_Valuee33 = revert_change_fd_Calculator_Maturity_Value33
				.replaceAll("[₹ ,]", "");

		int parseInt_revert_change_fd_Calculator_Maturity_Valuee33 = Integer
				.parseInt(revert_change_fd_Calculator_Maturity_Valuee33);

		System.out.println(parseInt_revert_change_fd_Calculator_Maturity_Valuee33);

		if (parseInt_Onload_fd_Calculator_Maturity_Valuee22 != parseInt_Postchange_fd_Calculator_Maturity_Valuee22
				&& parseInt_Onload_fd_Calculator_Maturity_Valuee22 == parseInt_revert_change_fd_Calculator_Maturity_Valuee33) {

			System.out.println("Fixed deposit calculator's I am a Woman radio button is working fine");

		} else {

			System.out.println("Fixed deposit calculator's I am a Woman radio button isn't working ");
		}
		
		
//*************************************************************_Interest payout term_**************************************************************************************		

		
		WebElement fd_Calculator_Maturity_Value222 = homepageLocators.getFD_Calculator_Maturity_Value();

		hold(2000);

		String Onload_fd_Calculator_Maturity_Value222 = fd_Calculator_Maturity_Value222.getText();

		String Onload_fd_Calculator_Maturity_Valuee222 = Onload_fd_Calculator_Maturity_Value222.replaceAll("[₹ ,]", "");

		int parseInt_Onload_fd_Calculator_Maturity_Valuee222 = Integer.parseInt(Onload_fd_Calculator_Maturity_Valuee222);

		System.out.println(parseInt_Onload_fd_Calculator_Maturity_Valuee222);
		
		scrollDown(homepageLocators.getFD_Calculator_step_05());
		
		
		
		
		
	}
}