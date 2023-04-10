package org.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.base.BaseClass;
import org.excel.gtm.ExcelUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


 
public class GTM_Verification extends BaseClass {
	
	
	
	@BeforeTest
	public void browserlaunch() {

		launchBrowser("chrome");
	}
	
	@AfterTest
	public void browserCLose() {
		
		driver.quit();
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}
	
	
	
	
	@Test(dataProvider = "getTestData")
	public void execution(String INDEX, String Slug_URL) throws Exception {

		loadUrl("https://www.shriram.com/");
		
		String pageSource = driver.getPageSource();
       
		Pattern pattern = Pattern.compile("id=GTM-[A-Za-z0-9]+");
       
		Matcher matcher = pattern.matcher(pageSource);
        
		if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
		
//		boolean contains = driver.getPageSource().contains("GTM-NN6C68N");
//		
//		if (contains==true) {
//			
//			System.out.println("GTM Code Matched");
//			
//			int parseInt = Integer.parseInt(INDEX);
//			
//			ExcelUtils.writeinexcel("GTM Code Matched", parseInt);
//		} else {
//
//			System.out.println("GTM Code Mismatch");
//			
//			int parseInt = Integer.parseInt(INDEX);
//			
//			ExcelUtils.writeinexcel("GTM Code Mismatch", parseInt);
//		}
		
		
	}
	
	
}