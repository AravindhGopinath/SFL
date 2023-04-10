package org.run;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RunnerClass extends BaseClass{

	
	
	 @DataProvider
	    public Iterator<Object[]> getTestData() {

	        ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
	        return testData.iterator();

	    }
	    
	    
	 @Test(dataProvider = "getTestData")   
	 
	 public static void main(String[] args, String Slug_URL){
		 
	 launchBrowser("chrome");
	
	 loadUrl(Slug_URL);
	 
	 driver.manage().window().maximize();
	 
	 WebElement Parent_Tag = driver.findElement(By.xpath("//div[@class='eligi_bility']"));
	 
	 List<WebElement> allLinks = Parent_Tag.findElements(By.tagName("a"));
	 
//	 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 
	 for(WebElement link:allLinks){
		 
	 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	 
	 }
	 
//	 driver.quit();
	 } 
	 
	
	
}
