
package org.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.base.BaseClass;
import org.excel.gtm.ExcelUtils;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lat_Long extends BaseClass {

	@BeforeTest
	
	public void launchBrowser() {

		launchBrowser("chrome");
		
	}
	
	@AfterTest
	
	public void quitBrowser() {
		driver.quit();
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}
	
	@Test(dataProvider = "getTestData")
	public void execution(String INDEX, String Address) throws Exception {

		loadUrl("https://www.mapdevelopers.com/geocode_tool.php");
		
		driver.findElement(By.id("address")).click();
		
		driver.findElement(By.id("address")).sendKeys(Address);
		
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
		
		
		Thread.sleep(4000);
		
		String Latitude = driver.findElement(By.id("display_lat")).getText();
		
		 int parseInt = Integer.parseInt(INDEX);  
		 ExcelUtils.writeinexcel(Latitude, parseInt);
		
		String Longitude = driver.findElement(By.id("display_lng")).getText();

		 int parseInt1 = Integer.parseInt(INDEX);  
		 ExcelUtils.writeinexcel2(Longitude, parseInt1);
		
		System.out.println(Latitude+" & "+Longitude);
		
		
		
	}
	
}
