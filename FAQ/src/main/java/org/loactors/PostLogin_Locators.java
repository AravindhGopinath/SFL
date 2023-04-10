package org.loactors;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostLogin_Locators extends BaseClass {


    public PostLogin_Locators() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    
    @FindBy(id="dash_board")
    private WebElement tab_dashboard_button;
    
    @FindBy(id="Dash_myloan")
    private WebElement dashboard_myloan_tab_button;
    
    @FindBy(id="My_deposits")
    private WebElement dashboard_mydeposits_tab_button;
 
    @FindBy(xpath="//h1[text()='No Loan Found!']")
    private WebElement no_loan_found_in_dashboard_myloan_tab;
    
    @FindBy(xpath=" //h1[text()='No Deposit Found!']")
    private WebElement no_deposits_found_in_dashboard_myloan_tab;
    
    @FindBy(id="dash_App_newloan")
    private WebElement apply_now_button_dashboard;
    
    @FindBy(xpath="//h1[text()='Apply For New Loan']")
    private WebElement apply_now_button_gettext;
    
    @FindBy(id="Notification")
    private WebElement notification_button_dashboard;
    
    @FindBy(xpath="//h5[text()='Notification Center']")
    private WebElement notification_contnet;
    
    @FindBy(xpath="(//i[@class='icon-Delete'])[2]")
    private WebElement notification_close_button;
    
    @FindBy(id="Icon_material-person-outline")
    private WebElement Quickservice_icon_dashboard;
    
    @FindBy(xpath="//h5[text()='Quick Services']")
    private WebElement Quickservice_content;
    
    @FindBy(xpath="(//i[@class='icon-Delete'])[3]")
    private WebElement quickservice_close_button;
    
    







}
