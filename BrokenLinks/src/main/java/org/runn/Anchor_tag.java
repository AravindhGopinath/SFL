package org.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.SystemUtils;
import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.excel2.ExcelUtils2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Anchor_tag extends BaseClass {
	
	
	static  List<String> data= new ArrayList<String>();
	
	 @DataProvider
	    public Iterator<Object[]> getTestData() {

	        ArrayList<Object[]> testData = ExcelUtils2.getDataFromexcel();
	        return testData.iterator();

	    }
	
	
	@Test(dataProvider = "getTestData")
	public void execute(String INDEX, String Slug_URL) {
		


		 
		 try {
			 
			launchBrowser("chrome");

		    loadUrl("https://uat.shriram.com/passenger-commercial-vehicle-finance");
			    
		  

//		    WebElement Parent_Tag = driver.findElement(By.xpath("/html"));
		    
		    
		    String[] tagname= {"script","img","a","link"};
		    
		    for (String ki :tagname) {
				
				 List<WebElement> allLinks = driver.findElements(By.tagName(ki));
				 
				 for(WebElement link:allLinks){
					 
					 
					 String[] attname= {"href","src","data-src"};
					 
					 for (String gi :attname) {
						
						 String attribute = link.getAttribute(gi);
						 
						 System.out.println(attribute);
					}
					 
					
					 

					
//					 data.add(attribute);
					 
		   
					 }

			}
			 
//			 List<WebElement> allLinks = Parent_Tag.findElements(By.tagName("script"));
////			 
////			 
//			 for(WebElement link:allLinks){
////				 
////				 
//			 String attribute = link.getAttribute("src");
////			 
//			 System.out.println(attribute);
//			 

			
//			 data.add(attribute);
			 
   
//			 }
			 
//			 String join = String.join(", "+"\n", data );
//			 System.out.println(join);
//			 int parseInt = Integer.parseInt(INDEX);  
//			 ExcelUtils2.writeinexcel(join, parseInt);
//			 data.clear();
			 
			 
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

	   	
	   	 
		 driver.quit();
		 
	 }
	
	
	
}
