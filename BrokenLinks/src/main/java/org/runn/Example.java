package org.run;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.excel2.ExcelUtils2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example extends BaseClass {

	static List<String> data = new ArrayList<String>();
	
	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}
	
	
	@Test(dataProvider = "getTestData")
    public void verifyLink(String INDEX, String Slug_URL) throws Throwable {

     
        try {
//			String url = "";
//			HttpURLConnection huc = null;
//			int respCode = 200;

			launchBrowser("chrome");
			
			loadUrl("https://uat.shriram.com/article-premature-withdrawal-of-fixed-deposit-and-effect-on-interest-calculation");
			
			WebElement findElement = driver.findElement(By.xpath("//div[@class='eligi_bility']"));
			
			
			List<WebElement> links = findElement.findElements(By.tagName("a"));

			for (WebElement we : links) {
				
				String text = we.getText();
				
//				System.out.println(text);
				
			}
			
			
//
			Iterator<WebElement> it = links.iterator();
//
//			int count = 1;
//
			while (it.hasNext()) {

				
				
//			    System.out.println(count++);

			    String url = it.next().getAttribute("href");
			    
//			    System.out.println(url);


			    if (url == null || url.isEmpty()) {


			        System.out.println("Null value");
			        continue;
			    }
			    
			    if (!url.startsWith("https://uat.shriram.com/")) {
			        if ((!url.startsWith("tel"))) {
			            if ((!url.startsWith("java"))) {
			                System.out.println(url);
//			                data.add(url);
//			                
			                continue;
			            }
//
			        }
//
			    }
			    
			}
			
//			String join = String.join(", "+"\n", data );
//			 System.out.println(join);
//			 int parseInt = Integer.parseInt(INDEX);  
//			 ExcelUtils.writeinexcel(join, parseInt);
//			 data.clear();
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        driver.quit();
    } 
}