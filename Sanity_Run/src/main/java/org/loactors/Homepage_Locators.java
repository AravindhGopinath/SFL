package org.loactors;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Locators extends BaseClass {

	public Homepage_Locators() {

		PageFactory.initElements(driver, this);
	}

	@CacheLookup

	@FindBy(xpath = "//h3[text()='Secure your future today']")
	private WebElement FD_Landing_Page_Content;

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/app-header/header/section[2]/div/div/div[1]/p/span[1]")
	private WebElement Deposits_Accordian;

	@FindBy(xpath = "//span[text()=' Loans ']")
	private WebElement Loans_Accordian;

	@FindBy(xpath = "//span[text()=' Pay Online']")
	private WebElement Pay_Online_Accordian;

	@FindBy(xpath = "//span[text()=' Calculators ']")
	private WebElement Calcualtor_Accordian;

	@FindBy(xpath = "//span[text()=' Resources ']")
	private WebElement Resources_Accordian;

	@FindBy(xpath = "//span[text()=' Discover Shriram ']")
	private WebElement Discover_Shriram_Accordian;

	@FindBy(xpath = "//a[text()=' Investors ']")
	private WebElement Investors_Accordian;

	@FindBy(xpath = "//span[text()=' Contact us ']")
	private WebElement Contact_Us_Accordian;

	@FindBy(id = "notification_icon")
	private WebElement Notification_icon;

	@FindBy(xpath = "//img[@class='close_button']")
	private WebElement Notification_Close_button;

	@FindBy(id = "main_nav_fd")
	private WebElement Homepage_FD_button;

	@FindBy(id = "main_nav_rd")
	private WebElement Homepage_RD_button;

	@FindBy(id = "main_nav_twl")
	private WebElement Homepage_Two_Wheeler_loan_button;

	@FindBy(id = "main_nav_gl")
	private WebElement Homepage_Gold_loan_button;

	@FindBy(xpath = "(//a[@id='main_nav_gl'])[2]")
	private WebElement Homepage_Personal_loan_button;

	@FindBy(xpath = "(//a[@id='main_nav_gl'])[3]")
	private WebElement Homepage_New_Car_loan_button;

	@FindBy(id = "main_nav_cvl")
	private WebElement Homepage_Commercial_Vehicle_loan_button;

	@FindBy(id = "main_nav_cgvf")
	private WebElement Homepage_Commercial_Goods_Vehicle_Finance_button;

	@FindBy(id = "main_nav_pcvf")
	private WebElement Homepage_Passenger_Commercial_Vehicle_Finance_button;

	@FindBy(id = "main_nav_tractor")
	private WebElement Homepage_Tractor_and_Farm_Equipment_Finance_button;

	@FindBy(id = "main_nav_construction")
	private WebElement Homepage_Construction_Equipment_Finance_button;

	@FindBy(id = "main_nav_wcl")
	private WebElement Homepage_Working_Capital_loan_button;

	@FindBy(id = "main_nav_vif")
	private WebElement Homepage_Vehicle_Insurance_Finance_button;

	@FindBy(id = "main_nav_tyre")
	private WebElement Homepage_Tyre_Finance_button;

	@FindBy(id = "main_nav_tax")
	private WebElement Homepage_Tax_Finance_button;

	@FindBy(id = "main_nav_toll")
	private WebElement Homepage_Toll_Finance_button;

	@FindBy(id = "main_nav_repair")
	private WebElement Homepage_Repair_Topup_Loan_button;

	@FindBy(id = "main_nav_fuel_finance")
	private WebElement Homepage_Fuel_Finance_button;

	@FindBy(id = "main_nav_cd")
	private WebElement Homepage_Challan_Discounting_button;

	@FindBy(id = "main_nav_bl")
	private WebElement Homepage_Business_Loan_button;

	@FindBy(xpath = "(//a[@id='main_nav_bl'])[2]")
	private WebElement Homepage_Collateral_Free_Business_Loan_button;

	@FindBy(id = "main_nav_payemi")
	private WebElement Homepage_Pay_Loan_Emi_button;

	@FindBy(xpath = "(//a[@class='header-a'])[17]")
	private WebElement Homepage_RD_Installment_Pay_button;

	@FindBy(id = "main_nav_fd_calc")
	private WebElement Homepage_FD_Calculator_button;

	@FindBy(id = "main_nav_Rd_calc")
	private WebElement Homepage_RD_Calculator_button;

	@FindBy(id = "main_nav_twl_calc")
	private WebElement Homepage_Two_Wheeler_Loan_Calculator_button;

	@FindBy(id = "main_nav_gl_calc")
	private WebElement Homepage_Gold_Loan_Calculator_button;

	@FindBy(id = "main_nav_bl_calc")
	private WebElement Homepage_Business_Loan_Calculator_button;

	@FindBy(id = "main_nav_cml_calc")
	private WebElement Homepage_Commercial_Vehicle_Loan_Calculator_button;

	@FindBy(id = "main_nav_wcl_calc")
	private WebElement Homepage_Working_Capital_Loan_Calculator_button;

	@FindBy(id = "main_nav_articles")
	private WebElement Homepage_Articles_button;

	@FindBy(id = "main_nav_testimonials")
	private WebElement Homepage_Testimonials_button;

	@FindBy(id = "main_nav_downloads")
	private WebElement Homepage_Downloads_button;

	@FindBy(id = "main_nav_aboutus")
	private WebElement Homepage_About_Us_button;

	@FindBy(id = "main_nav_csr")
	private WebElement Homepage_CSR_button;

	@FindBy(id = "main_nav_media")
	private WebElement Homepage_Media_button;

	@FindBy(id = "main_nav_careers")
	private WebElement Homepage_Careers_button;

	@FindBy(id = "main_nav_reach_us")
	private WebElement Homepage_Reach_Us_button;

	@FindBy(id = "main_nav_branch_locator")
	private WebElement Homepage_Branch_Locator_button;

	@FindBy(id = "main_nav_fuel_center")
	private WebElement Homepage_Fuel_Center_button;

	@FindBy(id = "main_nav_faq")
	private WebElement Homepage_FQA_button;

	@FindBy(id = "main_nav_service_request")
	private WebElement Homepage_Service_Request_button;

	@FindBy(xpath = "//h3[text()='Grow your hard earned savings']")
	private WebElement RD_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Getting a two-wheeler loan ']")
	private WebElement TW_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Quick Money for Gold ']")
	private WebElement GL_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Getting a personal loan ']")
	private WebElement PL_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Better journeys, starting today  With Shriram New Car Loans']")
	private WebElement New_Car_Loan_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Grow your business with']")
	private WebElement Commercial_Vehicle_Loan_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Grow your business with ']")
	private WebElement Commercial_Goods_Vehicle_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Scale your business with affordable']")
	private WebElement Passenger_Commercial_Vehicle_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Get Affordable  ']")
	private WebElement Tractor_And_Farm_Equipment_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Get customised ']")
	private WebElement Construction_Equipment_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Stay business ready with']")
	private WebElement Working_Capital_Loans_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Get easy loan to pay off your Vehicle Insurance with ']")
	private WebElement Vehicle_Insurance_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Ensure uninterrupted running of your vehicles with a ']")
	private WebElement Tyre_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Get quick loan to pay your business taxes with  ']")
	private WebElement Tax_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Drive past tolls seamlessly with the most affordable ']")
	private WebElement Toll_Finance_Landing_Page_Content;

	@FindBy(xpath = "//p[text()='Manage your unforeseen business expenses with ']")
	private WebElement Repair_Topup_Loan_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Get quick loan to manage your mounting fuel expenses with ']")
	private WebElement Fuel_Finance_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Keep your Vehicle Running with affordable ']")
	private WebElement Challan_Discounting_Landing_Page_Content;

	@FindBy(xpath = "//h3[text()='Funds for all your ']")
	private WebElement Business_Loan_Landing_Page_Content;

	@FindBy(xpath = "//span[text()='Do you have business ']")
	private WebElement Collateral_Free_Business_Loan_Landing_Page_Content;

	@FindBy(xpath = "//p[text()='Zero Collateral']")
	private WebElement Collateral_Free_Business_Loan_2_Landing_Page_Content;

	@FindBy(xpath = "//h2[text()='Loan EMI Payment']")
	private WebElement Loan_EMI_Payment_Landing_Page_Content;

	@FindBy(xpath = "//h2[text()='Recurring Deposit Instalment Payment']")
	private WebElement RD_Installment_Pay_Landing_Page_Content;

	@FindBy(id = "CMatAmt")
	private WebElement FD_Calculator_Maturity_Value;

	@FindBy(xpath = "(//div[@class='mat-slider-thumb'])[2]")
	private WebElement FD_Calculator_Investment_amount_slider_pointer;

	@FindBy(xpath = "(//div[@class='mat-slider-thumb'])[1]")
	private WebElement FD_Calculator_Tenure_amount_slider_pointer;

	@FindBy(xpath = "//div[@class='input-box p-relative search-box focused fd-calc']")
	private WebElement FD_Calculator_Interest_payout_term_dropdown_textbox;

	@FindBy(xpath = "//ul[@_ngcontent-serverapp-c81]")
	private WebElement FD_Calculator_Interest_payout_term_dropdown_list;

	@FindBy(id = "fdInvMonth")
	private WebElement FD_Calculator_Tenure_Textbox;

	@FindBy(id = "fdInvAmt")
	private WebElement FD_Calculator_Investment_Amount_Textbox;

	@FindBy(xpath = "//label[@for='Yes']")
	private WebElement FD_Calculator_Iam_a_Senior_Citizen_Radio_Yes_Button;

	@FindBy(xpath = "//label[@for='No']")
	private WebElement FD_Calculator_Iam_a_Senior_Citizen_Radio_No_Button;

	@FindBy(xpath = "//label[@for='F']")
	private WebElement FD_Calculator_Iam_a_Woman_Yes_button;

	@FindBy(xpath = "//label[@for='A']")
	private WebElement FD_Calculator_Iam_a_Woman_Radio_No_Button;

	@FindBy(xpath = "//p[text()='STEP 03']")
	private WebElement FD_Calculator_step_03;

	@FindBy(xpath = "//p[text()='STEP 05']")
	private WebElement FD_Calculator_step_05;

	@FindBy(id = "fixed-calc")
	private WebElement FD_Calculator_fd_calc_tab;

	public WebElement getFD_Calculator_Interest_payout_term_dropdown_textbox() {
		return FD_Calculator_Interest_payout_term_dropdown_textbox;
	}

	public WebElement getFD_Calculator_step_05() {
		return FD_Calculator_step_05;
	}

	public WebElement getFD_Calculator_fd_calc_tab() {
		return FD_Calculator_fd_calc_tab;
	}

	public WebElement getFD_Calculator_step_03() {
		return FD_Calculator_step_03;
	}

	public WebElement getFD_Calculator_Interest_payout_term_dropdown() {
		return FD_Calculator_Interest_payout_term_dropdown_textbox;
	}

	public WebElement getFD_Calculator_Interest_payout_term_dropdown_list() {
		return FD_Calculator_Interest_payout_term_dropdown_list;
	}

	public WebElement getFD_Calculator_Tenure_Textbox() {
		return FD_Calculator_Tenure_Textbox;
	}

	public WebElement getFD_Calculator_Investment_Amount_Textbox() {
		return FD_Calculator_Investment_Amount_Textbox;
	}

	public WebElement getFD_Calculator_Iam_a_Senior_Citizen_Radio_Yes_Button() {
		return FD_Calculator_Iam_a_Senior_Citizen_Radio_Yes_Button;
	}

	public WebElement getFD_Calculator_Iam_a_Senior_Citizen_Radio_No_Button() {
		return FD_Calculator_Iam_a_Senior_Citizen_Radio_No_Button;
	}

	public WebElement getFD_Calculator_Iam_a_Woman_Yes_button() {
		return FD_Calculator_Iam_a_Woman_Yes_button;
	}

	public WebElement getFD_Calculator_Iam_a_Woman_Radio_No_Button() {
		return FD_Calculator_Iam_a_Woman_Radio_No_Button;
	}

//	public WebElement getFD_Calculator_Interest_payout_term() {
//		return FD_Calculator_Interest_payout_term_dropdown;
//	}

	public WebElement getFD_Calculator_Tenure_amount_slider_pointer() {
		return FD_Calculator_Tenure_amount_slider_pointer;
	}

	public WebElement getFD_Calculator_Investment_amount_slider_pointer() {
		return FD_Calculator_Investment_amount_slider_pointer;
	}

	public WebElement getFD_Calculator_Maturity_Value() {
		return FD_Calculator_Maturity_Value;
	}

	public WebElement getRD_Installment_Pay_Landing_Page_Content() {
		return RD_Installment_Pay_Landing_Page_Content;
	}

	public WebElement getLoan_EMI_Payment_Landing_Page_Content() {
		return Loan_EMI_Payment_Landing_Page_Content;
	}

	public WebElement getCollateral_Free_Business_Loan_Landing_Page_Content() {
		return Collateral_Free_Business_Loan_Landing_Page_Content;
	}

	public WebElement getCollateral_Free_Business_Loan_2_Landing_Page_Content() {
		return Collateral_Free_Business_Loan_2_Landing_Page_Content;
	}

	public WebElement getBusiness_Loan_Landing_Page_Content() {
		return Business_Loan_Landing_Page_Content;
	}

	public WebElement getChallan_Discounting_Landing_Page_Content() {
		return Challan_Discounting_Landing_Page_Content;
	}

	public WebElement getFuel_Finance_Landing_Page_Content() {
		return Fuel_Finance_Landing_Page_Content;
	}

	public WebElement getRepair_Topup_Loan_Landing_Page_Content() {
		return Repair_Topup_Loan_Landing_Page_Content;
	}

	public WebElement getToll_Finance_Landing_Page_Content() {
		return Toll_Finance_Landing_Page_Content;
	}

	public WebElement getTax_Finance_Landing_Page_Content() {
		return Tax_Finance_Landing_Page_Content;
	}

	public WebElement getTyre_Finance_Landing_Page_Content() {
		return Tyre_Finance_Landing_Page_Content;
	}

	public WebElement getVehicle_Insurance_Finance_Landing_Page_Content() {
		return Vehicle_Insurance_Finance_Landing_Page_Content;
	}

	public WebElement getWorking_Capital_Loans_Landing_Page_Content() {
		return Working_Capital_Loans_Landing_Page_Content;
	}

	public WebElement getConstruction_Equipment_Finance_Landing_Page_Content() {
		return Construction_Equipment_Finance_Landing_Page_Content;
	}

	public WebElement getTractor_And_Farm_Equipment_Finance_Landing_Page_Content() {
		return Tractor_And_Farm_Equipment_Finance_Landing_Page_Content;
	}

	public WebElement getPassenger_Commercial_Vehicle_Finance_Landing_Page_Content() {
		return Passenger_Commercial_Vehicle_Finance_Landing_Page_Content;
	}

	public WebElement getCommercial_Goods_Vehicle_Finance_Landing_Page_Content() {
		return Commercial_Goods_Vehicle_Finance_Landing_Page_Content;
	}

	public WebElement getCommercial_Vehicle_Loan_Landing_Page_Content() {
		return Commercial_Vehicle_Loan_Landing_Page_Content;
	}

	public WebElement getNew_Car_Loan_Landing_Page_Content() {
		return New_Car_Loan_Landing_Page_Content;
	}

	public WebElement getPL_Landing_Page_Content() {
		return PL_Landing_Page_Content;
	}

	public WebElement getGL_Landing_Page_Content() {
		return GL_Landing_Page_Content;
	}

	public WebElement getTW_Landing_Page_Content() {
		return TW_Landing_Page_Content;
	}

	public WebElement getRD_Landing_Page_Content() {
		return RD_Landing_Page_Content;
	}

	public WebElement getFD_Landing_Page_Content() {
		return FD_Landing_Page_Content;
	}

	public WebElement getHomepage_FD_button() {
		return Homepage_FD_button;
	}

	public void setHomepage_FD_button(WebElement homepage_FD_button) {
		Homepage_FD_button = homepage_FD_button;
	}

	public WebElement getHomepage_RD_button() {
		return Homepage_RD_button;
	}

	public void setHomepage_RD_button(WebElement homepage_RD_button) {
		Homepage_RD_button = homepage_RD_button;
	}

	public WebElement getHomepage_Two_Wheeler_loan_button() {
		return Homepage_Two_Wheeler_loan_button;
	}

	public void setHomepage_Two_Wheeler_loan_button(WebElement homepage_Two_Wheeler_loan_button) {
		Homepage_Two_Wheeler_loan_button = homepage_Two_Wheeler_loan_button;
	}

	public WebElement getHomepage_Gold_loan_button() {
		return Homepage_Gold_loan_button;
	}

	public void setHomepage_Gold_loan_button(WebElement homepage_Gold_loan_button) {
		Homepage_Gold_loan_button = homepage_Gold_loan_button;
	}

	public WebElement getHomepage_Personal_loan_button() {
		return Homepage_Personal_loan_button;
	}

	public void setHomepage_Personal_loan_button(WebElement homepage_Personal_loan_button) {
		Homepage_Personal_loan_button = homepage_Personal_loan_button;
	}

	public WebElement getHomepage_New_Car_loan_button() {
		return Homepage_New_Car_loan_button;
	}

	public void setHomepage_New_Car_loan_button(WebElement homepage_New_Car_loan_button) {
		Homepage_New_Car_loan_button = homepage_New_Car_loan_button;
	}

	public WebElement getHomepage_Commercial_Vehicle_loan_button() {
		return Homepage_Commercial_Vehicle_loan_button;
	}

	public void setHomepage_Commercial_Vehicle_loan_button(WebElement homepage_Commercial_Vehicle_loan_button) {
		Homepage_Commercial_Vehicle_loan_button = homepage_Commercial_Vehicle_loan_button;
	}

	public WebElement getHomepage_Commercial_Goods_Vehicle_Finance_button() {
		return Homepage_Commercial_Goods_Vehicle_Finance_button;
	}

	public void setHomepage_Commercial_Goods_Vehicle_Finance_button(
			WebElement homepage_Commercial_Goods_Vehicle_Finance_button) {
		Homepage_Commercial_Goods_Vehicle_Finance_button = homepage_Commercial_Goods_Vehicle_Finance_button;
	}

	public WebElement getHomepage_Passenger_Commercial_Vehicle_Finance_button() {
		return Homepage_Passenger_Commercial_Vehicle_Finance_button;
	}

	public void setHomepage_Passenger_Commercial_Vehicle_Finance_button(
			WebElement homepage_Passenger_Commercial_Vehicle_Finance_button) {
		Homepage_Passenger_Commercial_Vehicle_Finance_button = homepage_Passenger_Commercial_Vehicle_Finance_button;
	}

	public WebElement getHomepage_Tractor_and_Farm_Equipment_Finance_button() {
		return Homepage_Tractor_and_Farm_Equipment_Finance_button;
	}

	public void setHomepage_Tractor_and_Farm_Equipment_Finance_button(
			WebElement homepage_Tractor_and_Farm_Equipment_Finance_button) {
		Homepage_Tractor_and_Farm_Equipment_Finance_button = homepage_Tractor_and_Farm_Equipment_Finance_button;
	}

	public WebElement getHomepage_Construction_Equipment_Finance_button() {
		return Homepage_Construction_Equipment_Finance_button;
	}

	public void setHomepage_Construction_Equipment_Finance_button(
			WebElement homepage_Construction_Equipment_Finance_button) {
		Homepage_Construction_Equipment_Finance_button = homepage_Construction_Equipment_Finance_button;
	}

	public WebElement getHomepage_Working_Capital_loan_button() {
		return Homepage_Working_Capital_loan_button;
	}

	public void setHomepage_Working_Capital_loan_button(WebElement homepage_Working_Capital_loan_button) {
		Homepage_Working_Capital_loan_button = homepage_Working_Capital_loan_button;
	}

	public WebElement getHomepage_Vehicle_Insurance_Finance_button() {
		return Homepage_Vehicle_Insurance_Finance_button;
	}

	public void setHomepage_Vehicle_Insurance_Finance_button(WebElement homepage_Vehicle_Insurance_Finance_button) {
		Homepage_Vehicle_Insurance_Finance_button = homepage_Vehicle_Insurance_Finance_button;
	}

	public WebElement getHomepage_Tyre_Finance_button() {
		return Homepage_Tyre_Finance_button;
	}

	public void setHomepage_Tyre_Finance_button(WebElement homepage_Tyre_Finance_button) {
		Homepage_Tyre_Finance_button = homepage_Tyre_Finance_button;
	}

	public WebElement getHomepage_Tax_Finance_button() {
		return Homepage_Tax_Finance_button;
	}

	public void setHomepage_Tax_Finance_button(WebElement homepage_Tax_Finance_button) {
		Homepage_Tax_Finance_button = homepage_Tax_Finance_button;
	}

	public WebElement getHomepage_Toll_Finance_button() {
		return Homepage_Toll_Finance_button;
	}

	public void setHomepage_Toll_Finance_button(WebElement homepage_Toll_Finance_button) {
		Homepage_Toll_Finance_button = homepage_Toll_Finance_button;
	}

	public WebElement getHomepage_Repair_Topup_Loan_button() {
		return Homepage_Repair_Topup_Loan_button;
	}

	public void setHomepage_Repair_Topup_Loan_button(WebElement homepage_Repair_Topup_Loan_button) {
		Homepage_Repair_Topup_Loan_button = homepage_Repair_Topup_Loan_button;
	}

	public WebElement getHomepage_Fuel_Finance_button() {
		return Homepage_Fuel_Finance_button;
	}

	public void setHomepage_Fuel_Finance_button(WebElement homepage_Fuel_Finance_button) {
		Homepage_Fuel_Finance_button = homepage_Fuel_Finance_button;
	}

	public WebElement getHomepage_Challan_Discounting_button() {
		return Homepage_Challan_Discounting_button;
	}

	public void setHomepage_Challan_Discounting_button(WebElement homepage_Challan_Discounting_button) {
		Homepage_Challan_Discounting_button = homepage_Challan_Discounting_button;
	}

	public WebElement getHomepage_Business_Loan_button() {
		return Homepage_Business_Loan_button;
	}

	public void setHomepage_Business_Loan_button(WebElement homepage_Business_Loan_button) {
		Homepage_Business_Loan_button = homepage_Business_Loan_button;
	}

	public WebElement getHomepage_Collateral_Free_Business_Loan_button() {
		return Homepage_Collateral_Free_Business_Loan_button;
	}

	public void setHomepage_Collateral_Free_Business_Loan_button(
			WebElement homepage_Collateral_Free_Business_Loan_button) {
		Homepage_Collateral_Free_Business_Loan_button = homepage_Collateral_Free_Business_Loan_button;
	}

	public WebElement getHomepage_Pay_Loan_Emi_button() {
		return Homepage_Pay_Loan_Emi_button;
	}

	public void setHomepage_Pay_Loan_Emi_button(WebElement homepage_Pay_Loan_Emi_button) {
		Homepage_Pay_Loan_Emi_button = homepage_Pay_Loan_Emi_button;
	}

	public WebElement getHomepage_RD_Installment_Pay_button() {
		return Homepage_RD_Installment_Pay_button;
	}

	public void setHomepage_RD_Installment_Pay_button(WebElement homepage_RD_Installment_Pay_button) {
		Homepage_RD_Installment_Pay_button = homepage_RD_Installment_Pay_button;
	}

	public WebElement getHomepage_FD_Calculator_button() {
		return Homepage_FD_Calculator_button;
	}

	public void setHomepage_FD_Calculator_button(WebElement homepage_FD_Calculator_button) {
		Homepage_FD_Calculator_button = homepage_FD_Calculator_button;
	}

	public WebElement getHomepage_RD_Calculator_button() {
		return Homepage_RD_Calculator_button;
	}

	public void setHomepage_RD_Calculator_button(WebElement homepage_RD_Calculator_button) {
		Homepage_RD_Calculator_button = homepage_RD_Calculator_button;
	}

	public WebElement getHomepage_Two_Wheeler_Loan_Calculator_button() {
		return Homepage_Two_Wheeler_Loan_Calculator_button;
	}

	public void setHomepage_Two_Wheeler_Loan_Calculator_button(WebElement homepage_Two_Wheeler_Loan_Calculator_button) {
		Homepage_Two_Wheeler_Loan_Calculator_button = homepage_Two_Wheeler_Loan_Calculator_button;
	}

	public WebElement getHomepage_Gold_Loan_Calculator_button() {
		return Homepage_Gold_Loan_Calculator_button;
	}

	public void setHomepage_Gold_Loan_Calculator_button(WebElement homepage_Gold_Loan_Calculator_button) {
		Homepage_Gold_Loan_Calculator_button = homepage_Gold_Loan_Calculator_button;
	}

	public WebElement getHomepage_Business_Loan_Calculator_button() {
		return Homepage_Business_Loan_Calculator_button;
	}

	public void setHomepage_Business_Loan_Calculator_button(WebElement homepage_Business_Loan_Calculator_button) {
		Homepage_Business_Loan_Calculator_button = homepage_Business_Loan_Calculator_button;
	}

	public WebElement getHomepage_Commercial_Vehicle_Loan_Calculator_button() {
		return Homepage_Commercial_Vehicle_Loan_Calculator_button;
	}

	public void setHomepage_Commercial_Vehicle_Loan_Calculator_button(
			WebElement homepage_Commercial_Vehicle_Loan_Calculator_button) {
		Homepage_Commercial_Vehicle_Loan_Calculator_button = homepage_Commercial_Vehicle_Loan_Calculator_button;
	}

	public WebElement getHomepage_Working_Capital_Loan_Calculator_button() {
		return Homepage_Working_Capital_Loan_Calculator_button;
	}

	public void setHomepage_Working_Capital_Loan_Calculator_button(
			WebElement homepage_Working_Capital_Loan_Calculator_button) {
		Homepage_Working_Capital_Loan_Calculator_button = homepage_Working_Capital_Loan_Calculator_button;
	}

	public WebElement getHomepage_Articles_button() {
		return Homepage_Articles_button;
	}

	public void setHomepage_Articles_button(WebElement homepage_Articles_button) {
		Homepage_Articles_button = homepage_Articles_button;
	}

	public WebElement getHomepage_Testimonials_button() {
		return Homepage_Testimonials_button;
	}

	public void setHomepage_Testimonials_button(WebElement homepage_Testimonials_button) {
		Homepage_Testimonials_button = homepage_Testimonials_button;
	}

	public WebElement getHomepage_Downloads_button() {
		return Homepage_Downloads_button;
	}

	public void setHomepage_Downloads_button(WebElement homepage_Downloads_button) {
		Homepage_Downloads_button = homepage_Downloads_button;
	}

	public WebElement getHomepage_About_Us_button() {
		return Homepage_About_Us_button;
	}

	public void setHomepage_About_Us_button(WebElement homepage_About_Us_button) {
		Homepage_About_Us_button = homepage_About_Us_button;
	}

	public WebElement getHomepage_CSR_button() {
		return Homepage_CSR_button;
	}

	public void setHomepage_CSR_button(WebElement homepage_CSR_button) {
		Homepage_CSR_button = homepage_CSR_button;
	}

	public WebElement getHomepage_Media_button() {
		return Homepage_Media_button;
	}

	public void setHomepage_Media_button(WebElement homepage_Media_button) {
		Homepage_Media_button = homepage_Media_button;
	}

	public WebElement getHomepage_Careers_button() {
		return Homepage_Careers_button;
	}

	public void setHomepage_Careers_button(WebElement homepage_Careers_button) {
		Homepage_Careers_button = homepage_Careers_button;
	}

	public WebElement getHomepage_Reach_Us_button() {
		return Homepage_Reach_Us_button;
	}

	public void setHomepage_Reach_Us_button(WebElement homepage_Reach_Us_button) {
		Homepage_Reach_Us_button = homepage_Reach_Us_button;
	}

	public WebElement getHomepage_Branch_Locator_button() {
		return Homepage_Branch_Locator_button;
	}

	public void setHomepage_Branch_Locator_button(WebElement homepage_Branch_Locator_button) {
		Homepage_Branch_Locator_button = homepage_Branch_Locator_button;
	}

	public WebElement getHomepage_Fuel_Center_button() {
		return Homepage_Fuel_Center_button;
	}

	public void setHomepage_Fuel_Center_button(WebElement homepage_Fuel_Center_button) {
		Homepage_Fuel_Center_button = homepage_Fuel_Center_button;
	}

	public WebElement getHomepage_FQA_button() {
		return Homepage_FQA_button;
	}

	public void setHomepage_FQA_button(WebElement homepage_FQA_button) {
		Homepage_FQA_button = homepage_FQA_button;
	}

	public WebElement getHomepage_Service_Request_button() {
		return Homepage_Service_Request_button;
	}

	public void setHomepage_Service_Request_button(WebElement homepage_Service_Request_button) {
		Homepage_Service_Request_button = homepage_Service_Request_button;
	}

	public WebElement getNotification_icon() {
		return Notification_icon;
	}

	public void setNotification_icon(WebElement notification_icon) {
		Notification_icon = notification_icon;
	}

	public WebElement getNotification_Close_button() {
		return Notification_Close_button;
	}

	public void setNotification_Close_button(WebElement notification_Close_button) {
		Notification_Close_button = notification_Close_button;
	}

	public WebElement getLoans_Accordian() {
		return Loans_Accordian;
	}

	public void setLoans_Accordian(WebElement loans_Accordian) {
		Loans_Accordian = loans_Accordian;
	}

	public WebElement getPay_Online_Accordian() {
		return Pay_Online_Accordian;
	}

	public void setPay_Online_Accordian(WebElement pay_Online_Accordian) {
		Pay_Online_Accordian = pay_Online_Accordian;
	}

	public WebElement getCalcualtor_Accordian() {
		return Calcualtor_Accordian;
	}

	public void setCalcualtor_Accordian(WebElement calcualtor_Accordian) {
		Calcualtor_Accordian = calcualtor_Accordian;
	}

	public WebElement getResources_Accordian() {
		return Resources_Accordian;
	}

	public void setResources_Accordian(WebElement resources_Accordian) {
		Resources_Accordian = resources_Accordian;
	}

	public WebElement getDiscover_Shriram_Accordian() {
		return Discover_Shriram_Accordian;
	}

	public void setDiscover_Shriram_Accordian(WebElement discover_Shriram_Accordian) {
		Discover_Shriram_Accordian = discover_Shriram_Accordian;
	}

	public WebElement getInvestors_Accordian() {
		return Investors_Accordian;
	}

	public void setInvestors_Accordian(WebElement investors_Accordian) {
		Investors_Accordian = investors_Accordian;
	}

	public WebElement getContact_Us_Accordian() {
		return Contact_Us_Accordian;
	}

	public void setContact_Us_Accordian(WebElement contact_Us_Accordian) {
		Contact_Us_Accordian = contact_Us_Accordian;
	}

	public void setDeposits_Accordian(WebElement deposits_Accordian) {
		Deposits_Accordian = deposits_Accordian;
	}

	public WebElement getDeposits_Accordian() {
		return Deposits_Accordian;
	}

}
