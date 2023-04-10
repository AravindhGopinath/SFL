package org.step;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.baseclass.Baseclass;
import org.openqa.selenium.interactions.Actions;
import org.utils.ExcelReader;
import org.webelements.Landing_Page_Xpaths;
import org.webelements.User_credentials_page_Xpaths;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_D   {
	
	@Given("user applies gold loan")
	public void user_applies_gold_loan() {
		
//	     Landing_Page_Xpaths lp = new Landing_Page_Xpaths();
//	     
//         wait_Click(lp.getNotice_close_btn());
//
//         scrollDown(lp.getGoldloan_calculator_btn());
//
//         wait_Click(lp.getGoldloan_calculator_btn());
//
//         Actions slider_automate = new Actions(driver);
//
//         slider_automate.dragAndDropBy(lp.getLoanamount_slider(), 220, 0).perform();
//
//         slider_automate.dragAndDropBy(lp.getAnnualized_rate_of_ineterest_slider(), 150, 0).perform();
//
//         slider_automate.dragAndDropBy(lp.getLoan_tenure_slider(), 30, 0).perform();
//
//         wait_Click(lp.getCalculator_applynow_btn());
//		
	}

	@When("user enter details from given sheetname {string} and rownumber {int}")
	public void user_enter_details_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		
		ExcelReader reader =new ExcelReader();
		
		List<Map<String,String>> td = reader.getData("C:\\Users\\a1354\\Workout\\Gold_Loan_Cucumber\\src\\main\\resources\\Excel\\Gold_Loan_Testdata.xlsx", sheetName);
		
		String Mobile_Number = td.get(rowNumber).get("Mobile_Number");
		String Applicant_Name = td.get(rowNumber).get("Applicant_Name");
		String Email = td.get(rowNumber).get("Email");

		
		
		
//		User_credentials_page_Xpaths uc =new User_credentials_page_Xpaths();
//
//        wait_Click(uc.getApplicant_name_field());
//
//        wait_Sendkeys(uc.getApplicant_name_field(), Applicant_Name);
//
//        wait_Click(uc.getMobile_number_field());
//
//        wait_Sendkeys(uc.getMobile_number_field(), Mobile_Number);
//
//        wait_Click(uc.getEmail_field_textbox());
//
//        wait_Sendkeys(uc.getEmail_field_textbox(), Email);
//
//        wait_Click(uc.getEnter_button());
		
	}

	@When("User finally apply loan")
	public void user_finally_apply_loan() {
		
	}

	@Then("Page takes to otp verification")
	public void page_takes_to_otp_verification() {
		
	}
	
}
