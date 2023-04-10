package org.webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BC.BaseClass.driver;

public class User_credentials_Third_page_Xpaths {

    public User_credentials_Third_page_Xpaths() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(id = "AFDob")

    private WebElement date_of_birth_field;

    @FindBy(xpath = "//img[@src='/bundle/assets/images/Instant Loan-img.webp']")

    private WebElement dummy_click_post_dob;

    public WebElement getDummy_click_post_dob() {
        return dummy_click_post_dob;
    }

    @FindBy(id = "AFGenderMale")

    private WebElement male_radio_btn;

    @FindBy(id = "AFGenderFemale")

    private WebElement female_radio_btn;

    @FindBy(id = "AFMaritalSingle")

    private WebElement single_radio_btn_marital_status;

    @FindBy(id = "AFMaritalMarried")

    private WebElement married_radio_btn_marital_status;

    @FindBy(id = "AFPAN")

    private WebElement pan_number;

    @FindBy(id = "AFLoan_amount")

    private WebElement loan_amount_required;

    @FindBy(id = "AFResidencePincode")

    private WebElement residence_pincode;

    @FindBy(id = "AFResidenceCity")

    private WebElement city_field_textbox;

    @FindBy(id = "AFState")

    private WebElement state_field_textbox;

    public WebElement getCity_field_textbox() {
        return city_field_textbox;
    }

    public WebElement getState_field_textbox() {
        return state_field_textbox;
    }

    @FindBy(xpath = "//span[@class='checkmark']")

    private WebElement checkbox_click;

    @FindBy(xpath = "//button[@class='t-btn t-btn-primary e-right qkgoldloandetsubmit']")

    private WebElement final_apply_now_btn;

    @FindBy(id = "AFotpCode")

    private WebElement otp_enter;

    @FindBy(xpath = "//button[@class='t-btn t-btn-primary t-btn-small btnotpverify']")

    private WebElement verify_otp_btn;

    @FindBy(xpath = "//a[@class='resendotp']")

    private WebElement resend_otp_btn;

    @FindBy(xpath = "//div[@class='c-p otpmobilechange']")

    private WebElement change_mob_number_btn;

    @FindBy(xpath = "//button[@class='close otppopupclose']")

    private WebElement otp_verification_popup_close_btn;

    public WebElement getOtp_enter() {
        return otp_enter;
    }

    public WebElement getVerify_otp_btn() {
        return verify_otp_btn;
    }

    public WebElement getResend_otp_btn() {
        return resend_otp_btn;
    }

    public WebElement getChange_mob_number_btn() {
        return change_mob_number_btn;
    }

    public WebElement getOtp_verification_popup_close_btn() {
        return otp_verification_popup_close_btn;
    }

    public WebElement getDate_of_birth_field() {
        return date_of_birth_field;
    }

    public WebElement getMale_radio_btn() {
        return male_radio_btn;
    }

    public WebElement getFemale_radio_btn() {
        return female_radio_btn;
    }

    public WebElement getSingle_radio_btn_marital_status() {
        return single_radio_btn_marital_status;
    }

    public WebElement getMarried_radio_btn_marital_status() {
        return married_radio_btn_marital_status;
    }

    public WebElement getPan_number() {
        return pan_number;
    }

    public WebElement getLoan_amount_required() {
        return loan_amount_required;
    }

    public WebElement getResidence_pincode() {
        return residence_pincode;
    }

    public WebElement getCheckbox_click() {
        return checkbox_click;
    }

    public WebElement getFinal_apply_now_btn() {
        return final_apply_now_btn;
    }
}
