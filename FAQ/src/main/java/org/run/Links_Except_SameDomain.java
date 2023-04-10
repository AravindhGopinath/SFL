package org.run;

import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.excel.gtm.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;


public class Links_Except_SameDomain extends BaseClass {

	static List<String> data = new ArrayList<String>();

	
	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
	}

	@AfterTest
	public void quitBrowse() {
		driver.quit();
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}
	
//	
	
//	
	@Test(dataProvider = "getTestData")
	public void execution(String INDEX, String PageURL) throws Exception {

		
		
//		launchBrowser("chrome");
//		
		loadUrl(PageURL);
		
//		WebElement findElement = driver.findElement(By.xpath("//div[@class='eligi_bility']"));
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

//		for (WebElement we : links) {
//			
//			String text = we.getText();
//			
//			System.out.println(text);
//			
//		}
		
		
//
		Iterator<WebElement> it = links.iterator();
//
//		int count = 1;
//
		while (it.hasNext()) {

			
			
//		    System.out.println(count++);

		    String url = it.next().getAttribute("href");
		    
		    
//		    System.out.println(url);


		    if (url == null || url.isEmpty()) {


		        System.out.println("Null value");
		        continue;
		    }
		    
		    if (!url.startsWith("https://www.shriramfinance.in/")) {
		        if ((!url.startsWith("tel"))) {
		            if ((!url.startsWith("java"))) {
//		                System.out.println(url);
		                data.add(url);
//		                
		                continue;
		            }
//
		        }
//
		    }
		    
		}
		
		String join = String.join(", "+"\n", data );
		 System.out.println(join);
		 int parseInt = Integer.parseInt(INDEX);  
		 ExcelUtils.writeinexcel(join, parseInt);
		 data.clear();
		
		
	}
	
	
	
	
}
