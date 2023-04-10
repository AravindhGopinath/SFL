package StepD;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.webelements.Landing_Page_Xpaths;
import org.webelements.User_credentials_Third_page_Xpaths;
import org.webelements.User_credentials_page_Xpaths;

import BC.BaseClass;
import XL_Reader.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	


@Given("user applies gold loan")
public void user_applies_gold_loan() {
	

	Landing_Page_Xpaths lp=new Landing_Page_Xpaths();

    wait_Click(lp.getNotice_close_btn());

    scrollDown(lp.getGoldloan_calculator_btn());

    wait_Click(lp.getGoldloan_calculator_btn());

    Actions slider_automate =new Actions(driver);
    
    String pre_Loan_amount_value = lp.getLoanamount_slider_value().getText();
    
    System.out.println(pre_Loan_amount_value);
    
    slider_automate.dragAndDropBy(lp.getLoanamount_slider(), 220, 0).perform();
    
    String post_Loan_amount_value = lp.getLoanamount_slider_value().getText();

    System.out.println(post_Loan_amount_value);
    
    if (pre_Loan_amount_value==post_Loan_amount_value) {
    	
    	System.out.println("Loan amount slider value hasn't changed");
			
	} else {
		
		System.out.println("Loan amount slider value has changed");
	}
    
    String pre_Annualized_rate_of_ineterest_slider_value = lp.getAnnualized_rate_of_ineterest_slider_value().getText();
    
    System.out.println(pre_Annualized_rate_of_ineterest_slider_value);
    
    slider_automate.dragAndDropBy(lp.getAnnualized_rate_of_ineterest_slider(), 150, 0).perform();

    String post_Annualized_rate_of_ineterest_slider_value = lp.getAnnualized_rate_of_ineterest_slider_value().getText();
    
    System.out.println(post_Annualized_rate_of_ineterest_slider_value);
    
    if (pre_Annualized_rate_of_ineterest_slider_value==post_Annualized_rate_of_ineterest_slider_value) {
    	
    	System.out.println("Annualized rate of interest slider value hasn't changed");
		
	} else {
		
		System.out.println("Annualized rate of interest slider value has changed");
	}
    
    String pre_Loan_tenure_slider_value = lp.getLoan_tenure_slider_value().getText();
    
    System.out.println(pre_Loan_tenure_slider_value);
    
    slider_automate.dragAndDropBy(lp.getLoan_tenure_slider(), 30, 0).perform();

    String post_Loan_tenure_slider_value = lp.getLoan_tenure_slider_value().getText();
    
    System.out.println(post_Loan_tenure_slider_value);
    
    if (pre_Loan_tenure_slider_value==post_Loan_tenure_slider_value) {
    	
    	System.out.println("Loan tenure slider value hasn't changed");
		
	} else {

		System.out.println("Loan tenure slider value has changed");
	}
    
    wait_Click(lp.getCalculator_applynow_btn());
	
	
}



@When("user enter details from given sheetname {string} and rownumber {int}")
public void user_enter_details_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
	

	ExcelReader reader =new ExcelReader();
	List<Map<String,String>> td = reader.getData("Gold_Loan_Testdata.xlsx", "Sheet1");
	
	String Applicant_Name = td.get(RowNumber).get("Applicant_Name");
	String Mobile_Number = td.get(RowNumber).get("Mobile_Number");
	String Email = td.get(RowNumber).get("Email");			
	

	User_credentials_page_Xpaths uc =new User_credentials_page_Xpaths();

    wait_Click(uc.getApplicant_name_field());

    wait_Sendkeys(uc.getApplicant_name_field(), Applicant_Name);

    wait_Click(uc.getMobile_number_field());

    wait_Sendkeys(uc.getMobile_number_field(), Mobile_Number);

    wait_Click(uc.getEmail_field_textbox());

    wait_Sendkeys(uc.getEmail_field_textbox(), Email);

    wait_Click(uc.getEnter_button());
}
@When("User finally apply loan {string} and rownumber {int}")
public void user_finally_apply_loan_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
	
	ExcelReader reader =new ExcelReader();
	List<Map<String,String>> td = reader.getData("Gold_Loan_Testdata.xlsx", "Sheet1");
	
	String DOB = td.get(RowNumber).get("DOB");
	String Gender = td.get(RowNumber).get("Gender");
	String Marital_Status = td.get(RowNumber).get("Marital_Status");
	String PAN_Number = td.get(RowNumber).get("PAN_Number");
	String Loan_Amount = td.get(RowNumber).get("Loan_Amount");
	String Pincode = td.get(RowNumber).get("Pincode");
	String City = td.get(RowNumber).get("City");
	String State = td.get(RowNumber).get("State");
	
	
	
	 User_credentials_Third_page_Xpaths uc3 =new User_credentials_Third_page_Xpaths();

     wait_Click(uc3.getDate_of_birth_field());

     wait_Sendkeys(uc3.getDate_of_birth_field(), DOB);

     wait_Click(uc3.getDummy_click_post_dob());

     String s = Gender;

     System.out.println(s);

     if (s.equals("Male")){

         Click(uc3.getMale_radio_btn());

//            wait_Click(uc3.getMale_radio_btn());



     } else if (s.equals("Female")) {

         Click(uc3.getFemale_radio_btn());

//            wait_Click(uc3.getFemale_radio_btn());



     }

     String s1= Marital_Status;
     System.out.println(s1);

     if (Marital_Status.equals("Single")){

         Click(uc3.getSingle_radio_btn_marital_status());
//            wait_Click(uc3.getSingle_radio_btn_marital_status());

     } else if (s1.equals("Married")) {

         Click(uc3.getMarried_radio_btn_marital_status());
//            wait_Click(uc3.getMarried_radio_btn_marital_status());
     }

     wait_Click(uc3.getPan_number());

     wait_Sendkeys(uc3.getPan_number(), PAN_Number);

     wait_Click(uc3.getLoan_amount_required());

     wait_Sendkeys(uc3.getLoan_amount_required(), Loan_Amount);

     wait_Click(uc3.getResidence_pincode());

     wait_Sendkeys(uc3.getResidence_pincode(), Pincode);

     wait_Click(uc3.getCity_field_textbox());
     
     wait_Sendkeys(uc3.getCity_field_textbox(), City);

     wait_Click(uc3.getState_field_textbox());

     wait_Sendkeys(uc3.getState_field_textbox(), State);

     wait_Click(uc3.getCheckbox_click());

     wait_Click(uc3.getFinal_apply_now_btn());

}
@Then("Page takes to otp verification {string} and rownumber {int}")
public void page_takes_to_otp_verification_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
	
	ExcelReader reader =new ExcelReader();
	List<Map<String,String>> td = reader.getData("Gold_Loan_Testdata.xlsx", "Sheet1");
	
	String OTP = td.get(RowNumber).get("OTP");
	
	 User_credentials_Third_page_Xpaths uc3 =new User_credentials_Third_page_Xpaths();

     wait_Click(uc3.getOtp_enter());

     wait_Sendkeys(uc3.getOtp_enter(), OTP);

     wait_Click(uc3.getVerify_otp_btn());
	
}
}


