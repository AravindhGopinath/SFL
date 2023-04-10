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

public class Articles_Interest_Rate extends BaseClass {

	static List<String> data = new ArrayList<String>();

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}
	
	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
	}
	
	@AfterTest
	public void browserQuit() {

		driver.quit();
	}

	@Test(dataProvider = "getTestData")
	public void verifyLink(String INDEX, String Articles_URL) throws Throwable {

		try {

//			launchBrowser("chrome");

			loadUrl(Articles_URL);

			WebElement Particular_div = driver.findElement(By.xpath("//div[@class='eligi_bility']"));

			String text = Particular_div.getText();

//			int length = text.length();

//			System.out.println("Total length is : "+length);

			if (text.contains("9.05")) {

				String currentUrl = driver.getCurrentUrl();

				String print = currentUrl + " Interest rate is presented";

				data.add(print);

				String join = String.join(", " + "\n", data);
				System.out.println(join);
				int parseInt = Integer.parseInt(INDEX);
				ExcelUtils.writeinexcel(join, parseInt);
				data.clear();

//				 int count=1;
//			        for (int i = 0; i <= length; i++) {
//			            if (text.contains("9.")) {
//			                count++;
//			                break;
//			            }
//			        }
//			        System.out.println("Count of Word present : "+count);
			}

			else {
				System.out.println("There's no Interest Rate found");
//				String join = String.join(", " + "\n", data);
//				System.out.println(join);
				int parseInt = Integer.parseInt(INDEX);
				ExcelUtils.writeinexcel("There's no Interest Rate found", parseInt);
				data.clear();
				
			} 

		} catch (Exception e) {

			e.printStackTrace();
		}

//		driver.quit();
	}
}
