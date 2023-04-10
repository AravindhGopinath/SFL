package org.run;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Neww_BrokenLinkss extends BaseClass {

	static List<String> data = new ArrayList<String>();

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
			
			String attribute="";

			Thread.sleep(5000);
			
//			driver.findElement(By.)

//			WebElement Parent_Tag = driver.findElement(By.xpath("/html"));

			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
			int size = allLinks.size();
			
			Iterator<WebElement> iterator = allLinks.iterator();
			
			System.out.println(size);

			while(iterator.hasNext()){

		  attribute = iterator.next().getAttribute("href");
		 
		 if (attribute==null||attribute.isEmpty()) {
			
			 System.out.println(attribute);
		 }

			if (!attribute.startsWith("https://uat.shriram.com/")) {
				
				if (!attribute.startsWith("tel")) {
					
					if (!attribute.startsWith("java")) {
						
						System.out.println(attribute);
					}
				}
			}
		

				

			

		}
		}
		catch (Exception e) {
		}

	}

}
