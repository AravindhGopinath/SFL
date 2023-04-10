package org.run;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Bad_Gateway_Handle extends BaseClass {
	


	static String url="";
	HttpURLConnection huc = null;
	int respCode = 200;
	
	static  List<String> data= new ArrayList<String>();
	
	 @DataProvider
	    public Iterator<Object[]> getTestData() {

	        ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
	        return testData.iterator();

	    }
	
	
	@Test(dataProvider = "getTestData")
	public void execute(String INDEX, String Slug_URL) throws IOException {
		


		 
		 try {
			 
			launchBrowser("chrome");

		    loadUrl("https://uat.shriram.com/");
			    
		    String[] tagname= {"img"};
		    
		    
		    huc = (HttpURLConnection)(new URL(url).openConnection());
		  
		    huc.setRequestMethod("HEAD");

		    huc.connect();
		    
		    
		    int responseCode = huc.getResponseCode();
		    
		    System.out.println(responseCode);
		    
		    
//		    if (responseCode>=400) {
		    	
		    	  
//			    for (String ki :tagname) {
//					
//					 List<WebElement> allLinks = driver.findElements(By.tagName(ki));
//					 
//					 for(WebElement link:allLinks){
//						 
//						 
//						 String[] attname= {"src"};
//						 
//						 for (String gi :attname) {
//							
//							 String attribute = link.getAttribute(gi);
//							 
//							 System.out.println(attribute);
//						}
//						 
//						
//						 
//
//						
////						 data.add(attribute);
//						 
//			   
//						 }
//
//				}
				 
				
//			} else  {
				
//				System.out.println("Status code is/above 400");
//			}
		    
		    
		    
//		    WebElement Parent_Tag = driver.findElement(By.xpath("/html"));
		    
		    
		  
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
