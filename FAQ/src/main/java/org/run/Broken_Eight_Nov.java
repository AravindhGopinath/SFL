package org.run;

import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Broken_Eight_Nov extends BaseClass {

	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
	}

	@AfterTest
	public void quitBrowse() {
		driver.quit();
	}

//	@DataProvider
//	public Iterator<Object[]> getTestData() {
//
//		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
//		return testData.iterator();
//
//	}
	
//	@Test(dataProvider = "getTestData")


	@Test
	public void runner() {

		String homePage = "https://www.shriramfinance.in/";
		loadUrl(homePage);

//		 Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("img"));

//		 This line will print the number of links and the count of links.
		System.out.println("No of links are " + links.size());

//		 checking the links fetched.
		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("src");
//		String url ="https://www.shriram.com/fixed-deposit/interest-rates/";
			if (url == null || url.isEmpty()) {
				System.out.println(url + " URL is either not configured for anchor tag or it is empty");
//				continue;
			}

			if (!url.startsWith(homePage)) {
				System.out.println(url + " URL belongs to another domain, skipping it.");
//				continue;
			}
			verifyLinks(url);
		}

		// driver.quit();
	}

	public static void verifyLinks(String linkUrl) {

		try {
			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			int responseCode = httpURLConnect.getResponseCode();
			String responseMessage = httpURLConnect.getResponseMessage();
			System.out.println(responseCode+" => "+responseMessage);
			
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
//				httpURLConnect.get
			}
		} catch (Exception e) {
		}
	}

}