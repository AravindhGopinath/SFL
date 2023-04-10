package org.loactors;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FD_Locators extends BaseClass {
	 
	public FD_Locators() {

	        PageFactory.initElements(driver, this);
	    }

	    @CacheLookup
	    
	    @FindBy(id="cus_mobile")
	    private WebElement Mobile_Number;
	    
	    @FindBy(id="cus_pincode")
	    private WebElement Pincode;
	    
	    @FindBy(id="cus_email")
	    private WebElement Email;
	   
	    @FindBy(id="pf-apply-btn")
	    private WebElement Invest_Now_Button;
	   
	    @FindBy(xpath="//span[@class='switch-label']")
	    private WebElement Assisted_Tog_Switch_Button;
	    
	    
	  
	    
		public WebElement getInvest_Now_Button() {
			return Invest_Now_Button;
		}

		public WebElement getAssisted_Tog_Switch_Button() {
			return Assisted_Tog_Switch_Button;
		}

		public WebElement getMobile_Number() {
			return Mobile_Number;
		}

		public WebElement getPincode() {
			return Pincode;
		}

		public WebElement getEmail() {
			return Email;
		}
	    
	    
	    
}
