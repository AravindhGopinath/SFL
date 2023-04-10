package org.webelements;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class User_credentials_page_Xpaths extends Baseclass {
    public User_credentials_page_Xpaths() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(id ="qkAFName")

    private WebElement applicant_name_field;

    @FindBy(id="qkAFMobile")

    private WebElement mobile_number_field;

    @FindBy(id = "qkAFEmail")

    private WebElement email_field_textbox;

    @FindBy(xpath = "//button[@class='btn btn-sm pr2 qkcopy']")

    private WebElement enter_button;

    public WebElement getApplicant_name_field() {
        return applicant_name_field;
    }

    public WebElement getMobile_number_field() {
        return mobile_number_field;
    }

    public WebElement getEmail_field_textbox() {
        return email_field_textbox;
    }

    public WebElement getEnter_button() {
        return enter_button;
    }
}
