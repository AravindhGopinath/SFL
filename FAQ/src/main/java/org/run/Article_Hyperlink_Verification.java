package org.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Article_Hyperlink_Verification extends BaseClass {

	String homepage = "https://www.shriram.com/";

	String url = "";

	
	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
	}

//	static List<String> data = new ArrayList<String>();

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public void execute(String INDEX, String Slug_URL) throws Exception {
		
		
		try {
			
		loadUrl(Slug_URL);	
		
		WebElement Oops_Text = driver.findElement(By.xpath("//h3[text()='Oops!']"));
		
		WebElement Something_Went_Wrong_Text = driver.findElement(By.xpath("//p[text()='Something went wrong! The requested page might have been moved or not exist anymore.']"));
		
//		boolean contains = driver.getPageSource().contains("GTM-NN6C68N");
//		
//		System.out.println(contains);
		
		if (Oops_Text.isDisplayed()||Something_Went_Wrong_Text.isDisplayed()) {
			
			System.out.println("Broken Link");
			
			 int parseInt = Integer.parseInt(INDEX);
			 ExcelUtils.writeinexcel("Broken link", parseInt);
		}else if (!url.startsWith(homepage)) {
			
			System.out.println("URL belongs to another domain");
			 int parseInt = Integer.parseInt(INDEX);
			 ExcelUtils.writeinexcel("URL belongs to another domain", parseInt);
		}
		
		}
		catch (Exception e) {
			System.out.println("Valid Link");
			 int parseInt = Integer.parseInt(INDEX);
			 ExcelUtils.writeinexcel("Valid link", parseInt);
			}
		}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
	
}
