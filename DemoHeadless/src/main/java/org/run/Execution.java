package org.run;

import org.base.BaseClass;
import org.testng.annotations.Test;

public class Execution extends BaseClass {

	@Test
	private void launch() {

		headless("chrome");

		loadUrl("https://www.novactech.in/careers");

		String title = driver.getTitle();

		System.out.println("Print : " + title);

	}

}
