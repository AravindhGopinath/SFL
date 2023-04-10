package org.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.SystemUtils;
import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class New_BrokenLink extends BaseClass {
	
	
	static  List<String> data= new ArrayList<String>();
	

	
	 @DataProvider
	    public Iterator<Object[]> getTestData() {

	        ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
	        return testData.iterator();

	    }
	
	
	@Test(dataProvider = "getTestData")
	public void execute(String INDEX, String Slug_URL) {
		


		 
		 try {
			 
			launchBrowser("chrome");

		    loadUrl("https://uat.shriram.com/commercial-vehicle-loan-calculator");
		    
		    Thread.sleep(3000);
			    
		    String s1 ="https://uat.shriram.com/";
		    
		    WebElement Parent_Tag = driver.findElement(By.xpath("/html"));
			 
			 List<WebElement> allLinks = Parent_Tag.findElements(By.tagName("a"));
			 
			 
			 for(WebElement link:allLinks){
				 
				 
			 String attribute = link.getAttribute("href");
			 
//			 System.out.println(attribute);
			 
//			 String[] kill = {"cos.stfc.in", "uat-secure.stfc.in/"};
			 
//			 for (String s :kill) {
				
//			 boolean contains = !attribute.startsWith(s1);
////			 
//////				 
////			 
////			 
				
					 
					 if (attribute==null||attribute.isEmpty()) {
						
						 System.out.println("is empty");
						 
					 }
						 
					 else if (!attribute.startsWith(s1)) {
					 if (attribute.startsWith("tel")) {
					 if (attribute.startsWith("java")) {
						 
					 }
					 
					 }
						 }
					 
					 
					 else {

						
					    System.out.println(attribute);
					    
					    data.add(attribute);
					
//					 
					}
//
//					} 
				 
				 
//			}
			 
			 
			 
//			 
			 
			 
			 
//			 data.add(attribute);
			 
   
//			 }
			 
		 
			 String join = String.join(", "+"\n", data );
//			 System.out.println(join);
//			 int parseInt = Integer.parseInt(INDEX);  
//			 ExcelUtils.writeinexcel(join, parseInt);
			 data.clear();
//			 
			 

			 }		 
					
		 }
					  catch (Exception e) {
					  
			e.printStackTrace();
			
		}

	   	
	   	 
		 driver.quit();
		 
	 
	
	
	
}
}