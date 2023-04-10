package org.run;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG extends BaseClass{

	@BeforeTest
	public void preLaunch() {
		
		launchBrowser("chrome");
	}
	
	@Test
	public void demo() {

		loadUrl("https://www.google.com");
		
		System.out.println("+++++++++++++++++++++++++++Finished++++++++++++++++++++");
	}
}
