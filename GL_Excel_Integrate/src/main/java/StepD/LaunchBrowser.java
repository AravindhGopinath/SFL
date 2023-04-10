package StepD;

import BC.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LaunchBrowser extends BaseClass {

	@Before
	
	public static void browlaunch() {

		launchBrowser("chrome");
		
		loadUrl("https://uat.shriramcity.in/");
	}
	
	
	@After
	
	public void browQuit() {
		
		quitBrowser();

	}
	

}
