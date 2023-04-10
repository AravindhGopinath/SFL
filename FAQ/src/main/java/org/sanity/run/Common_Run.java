package org.sanity.run;

import org.base.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Common_Run extends BaseClass{
	
	@BeforeTest
	public void browserLaunch() {
		
		launchBrowser("chrome");
		
		
	}
	
	@AfterTest
	public void quitBrowser() {
		
//		driver.quit();
	}
	
	
	@Test
	private void commonExecution() {

	Live_Sanity_Run.PreLoginExecution();
	
}	
	
}
