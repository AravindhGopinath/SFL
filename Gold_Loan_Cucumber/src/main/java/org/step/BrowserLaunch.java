package org.step;

import org.baseclass.Baseclass;

import io.cucumber.java.Before;

public class BrowserLaunch extends Baseclass {
	@Before
	private void browserAndUrlLaunch() {
		
		launchBrowser("chrome");
		
		loadUrl("https://uat.shriramcity.in/");
		
	}
	
	
	
}
