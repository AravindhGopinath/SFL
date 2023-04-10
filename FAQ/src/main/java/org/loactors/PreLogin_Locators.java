
package org.loactors;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreLogin_Locators extends BaseClass {


    public PreLogin_Locators() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    
    @FindBy(id="cusMobNo")
    private WebElement Mobile_No;
    
    @FindBy(id="cusMPin")
    private WebElement Mpin;
    
    @FindBy(id="cus_login_textcaptcha")
    private WebElement Captcha;
    
    @FindBy(id="loginWithMobileSubmit")
    private WebElement secure_login_submit_button;
    
    @FindBy(id="entOtpCode1")
    private WebElement OTP_1;
    
    @FindBy(id="entOtpCode2")
    private WebElement OTP_2;
    
    @FindBy(id="entOtpCode3")
    private WebElement OTP_3;
    
    @FindBy(id="entOtpCode4")
    private WebElement OTP_4;
    
    @FindBy(id="entOtpCode5")
    private WebElement OTP_5;
    
    @FindBy(id="entOtpCode6")
    private WebElement OTP_6;
    
    @FindBy(id="homeloginotpSubmit")
    private WebElement OTP_Verify_Button;
    
    @FindBy(xpath="(//a[text()='Dashboard'])[2]")
    private WebElement Dashboard_text;
    
    /**
	 * @return the dashboard_text
	 */
	public WebElement getDashboard_text() {
		return Dashboard_text;
	}

	/**
	 * @return the oTP_Verify_Button
	 */
	public WebElement getOTP_Verify_Button() {
		return OTP_Verify_Button;
	}

	/**
	 * @param oTP_Verify_Button the oTP_Verify_Button to set
	 */
	public void setOTP_Verify_Button(WebElement oTP_Verify_Button) {
		OTP_Verify_Button = oTP_Verify_Button;
	}

	/**
	 * @return the oTP_1
	 */
	public WebElement getOTP_1() {
		return OTP_1;
	}

	/**
	 * @param oTP_1 the oTP_1 to set
	 */
	public void setOTP_1(WebElement oTP_1) {
		OTP_1 = oTP_1;
	}

	/**
	 * @return the oTP_2
	 */
	public WebElement getOTP_2() {
		return OTP_2;
	}

	/**
	 * @param oTP_2 the oTP_2 to set
	 */
	public void setOTP_2(WebElement oTP_2) {
		OTP_2 = oTP_2;
	}

	/**
	 * @return the oTP_3
	 */
	public WebElement getOTP_3() {
		return OTP_3;
	}

	/**
	 * @param oTP_3 the oTP_3 to set
	 */
	public void setOTP_3(WebElement oTP_3) {
		OTP_3 = oTP_3;
	}

	/**
	 * @return the oTP_4
	 */
	public WebElement getOTP_4() {
		return OTP_4;
	}

	/**
	 * @param oTP_4 the oTP_4 to set
	 */
	public void setOTP_4(WebElement oTP_4) {
		OTP_4 = oTP_4;
	}

	/**
	 * @return the oTP_5
	 */
	public WebElement getOTP_5() {
		return OTP_5;
	}

	/**
	 * @param oTP_5 the oTP_5 to set
	 */
	public void setOTP_5(WebElement oTP_5) {
		OTP_5 = oTP_5;
	}

	/**
	 * @return the oTP_6
	 */
	public WebElement getOTP_6() {
		return OTP_6;
	}

	/**
	 * @param oTP_6 the oTP_6 to set
	 */
	public void setOTP_6(WebElement oTP_6) {
		OTP_6 = oTP_6;
	}

	/**
	 * @return the mobile_No
	 */
	public WebElement getMobile_No() {
		return Mobile_No;
	}

	/**
	 * @param mobile_No the mobile_No to set
	 */
	public void setMobile_No(WebElement mobile_No) {
		Mobile_No = mobile_No;
	}

	/**
	 * @return the mpin
	 */
	public WebElement getMpin() {
		return Mpin;
	}

	/**
	 * @param mpin the mpin to set
	 */
	public void setMpin(WebElement mpin) {
		Mpin = mpin;
	}

	/**
	 * @return the captcha
	 */
	public WebElement getCaptcha() {
		return Captcha;
	}

	/**
	 * @param captcha the captcha to set
	 */
	public void setCaptcha(WebElement captcha) {
		Captcha = captcha;
	}

	/**
	 * @return the secure_login_submit_button
	 */
	public WebElement getSecure_login_submit_button() {
		return secure_login_submit_button;
	}

	
}