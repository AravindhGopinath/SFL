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


public class Img_Links_Except_SameDomain extends BaseClass {

	static List<String> data = new ArrayList<String>();

	
	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
	}

	@AfterTest
	public void quitBrowse() {
		driver.quit();
	}
//
//	@DataProvider
//	public Iterator<Object[]> getTestData() {
//
//		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
//		return testData.iterator();
//
//	}
	
//	String INDEX, String PageURL
	
//	dataProvider = "getTestData"
	@Test
	public void execution() throws Exception {

		
		
//		launchBrowser("chrome");
		
//		PageURL
//		
		loadUrl("https://beta.shriram.com/commercial-vehicle-loan");
		
//		WebElement findElement = driver.findElement(By.xpath("//div[@class='eligi_bility']"));
		

		
		
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		
		String attribute = driver.findElement(By.cssSelector("#body div img")).getAttribute("innerHTML");
		
		System.out.println(attribute);
		
		
		
//		WebElement findElement2= driver.findElement(By.xpath("//img[contains(@src,'aws.com')]"));
//		
//		System.out.println(findElement2.getAttribute("innerHTML"));

//		for (WebElement we : links) {
//			
//			List<WebElement> links2 = we.findElements(By.tagName("img"));
//			
//			String text = we.getText();
//			
//			System.out.println(text);
			
//	}
		
		
//
		Iterator<WebElement> it = links.iterator();
//
//		int count = 1;
//
		while (it.hasNext()) {

			
			
//		    System.out.println(count++);

		    String url = it.next().getAttribute("src");
		    
		    
//		    System.out.println(url);


//		    try {
				if (url == null || url.isEmpty()) {


				    System.out.println("Null value");
//				    data.add("Null value");
				    continue;
				}
				
				 if (!url.startsWith("https://beta.shriram.com/")) {
				    if ((!url.startsWith("tel"))) {
				        if ((!url.startsWith("java"))) {
		               System.out.println(url);
//				            data.add(url);
//		                
				            continue;
				        }
//
				    }
//
				}
//			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		    
		}
		
//		 String join = String.join(", "+"\n", data );
//		 System.out.println(join);
//		 int parseInt = Integer.parseInt(INDEX);  
//		 ExcelUtils.writeinexcel(join, parseInt);
//		 data.clear();
		
		
	}
	
	
//	}
	
}