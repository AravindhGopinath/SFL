package org.webelements;


import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_Page_Xpaths extends Baseclass {

    public Landing_Page_Xpaths() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "//a[@class='close-btn']")

    private WebElement notice_close_btn;

    @FindBy(xpath = "(//a[@class='apply-now'])[3]")

    private WebElement goldloan_apply_now_btn;

    @FindBy(xpath = "//a[@class='goldloan']")

    private WebElement goldloan_calculator_btn;

    @FindBy(xpath="(//div[@class='noUi-touch-area'])[7]")

    private WebElement loanamount_slider;

    @FindBy(xpath = "(//div[@class='noUi-touch-area'])[8]")

    private WebElement annualized_rate_of_ineterest_slider;

    public WebElement getLoanamount_slider() {
        return loanamount_slider;
    }

    public WebElement getAnnualized_rate_of_ineterest_slider() {
        return annualized_rate_of_ineterest_slider;
    }

    public WebElement getLoan_tenure_slider() {
        return loan_tenure_slider;
    }

    @FindBy(xpath = "(//div[@class='noUi-touch-area'])[9]")

    private WebElement loan_tenure_slider;

    @FindBy(xpath = "(//a[@class='t-btn t-btn-primary btn-calc-apply e-center mt20'])[3]")

    private WebElement calculator_applynow_btn;


    public WebElement getNotice_close_btn() {
        return notice_close_btn;
    }

    public WebElement getGoldloan_apply_now_btn() {
        return goldloan_apply_now_btn;
    }

    public WebElement getGoldloan_calculator_btn() {
        return goldloan_calculator_btn;
    }


    public WebElement getCalculator_applynow_btn() {
        return calculator_applynow_btn;
    }
}
