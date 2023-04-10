package org.run;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess  {

	WebDriver driver;
	
	@Test
	public void verifyTitle() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			driver=new ChromeDriver(options);
			driver.get("https://www.browserstack.com/");
			System.out.println("Title is: " +driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
			driver.quit();
			}
	}


//System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\a1354\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
