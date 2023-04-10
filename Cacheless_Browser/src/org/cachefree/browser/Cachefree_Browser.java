package org.cachefree.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author a1354
 *
 */
public class Cachefree_Browser  {

	public static void main(String args[])
    {
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
  
        // Maximize the browser
        driver.manage().window().maximize();
  
    }
}
	

