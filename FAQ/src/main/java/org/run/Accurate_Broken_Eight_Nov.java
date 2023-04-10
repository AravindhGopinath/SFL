package org.run;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Accurate_Broken_Eight_Nov extends BaseClass {

	@BeforeTest
	public void browserLaunch() {

		launchBrowser("chrome");
	}

	@AfterTest
	public void quitBrowse() {
		driver.quit();
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public void runner(String INDEX, String Articles_URL) throws Exception {

		try {

			WebDriverWait Webwait = new WebDriverWait(driver, Duration.ofSeconds(30));

			System.out.println(INDEX + ") ==> " + Articles_URL);
			String homePage = "https://www.shriramfinance.in";
			loadUrl(Articles_URL);
			String url = Articles_URL;

			Thread.sleep(5000);
//
			String currentUrl = driver.getCurrentUrl();

			System.out.println(currentUrl);

			try {

				WebElement oops_page = driver.findElement(By.xpath("//h3[text()='Oops!']"));

//				System.out.println(oops_page);
//
//				String text = oops_page.getText();
//
//				System.out.println(text);

				Webwait.until(ExpectedConditions.visibilityOf(oops_page));

				if (oops_page.isDisplayed() || currentUrl.equals("https://www.shriramfinance.in/not-found")) {

					System.out.println(url + " Valid status code and the link is broken ");
					int parseInt = Integer.parseInt(INDEX);
					ExcelUtils.writeinexcel(" Valid status code and the link is broken ", parseInt);
					return;

				}
			} catch (Exception e) {

				System.out.println(e);
			}

			if (url == null || url.isEmpty()) {
				System.out.println(url + " URL is either not configured for anchor tag or it is empty");
				int parseInt = Integer.parseInt(INDEX);
				ExcelUtils.writeinexcel(url + " URL is either not configured for anchor tag or it is empty", parseInt);
			}

			if (!url.startsWith(homePage)) {
				System.out.println(url + " URL belongs to another domain, skipping it.");
				int parseInt = Integer.parseInt(INDEX);
				ExcelUtils.writeinexcel(url + " URL belongs to another domain, skipping it.", parseInt);
			}

			URL urll = new URL(Articles_URL);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) urll.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			int responseCode = httpURLConnect.getResponseCode();
			String responseMessage = httpURLConnect.getResponseMessage();

			// System.out.println(responseCode+" => "+responseMessage);
			String string = Integer.toString(responseCode);

			if (responseCode >= 300) {
				System.out.println(
						Articles_URL + " - " + responseCode + " ==> " + responseMessage + " and it's a broken link");
				int parseInt = Integer.parseInt(INDEX);
				ExcelUtils.writeinexcel(responseCode + " ==> " + responseMessage + " and it's a broken link", parseInt);
			} else if (string.isEmpty() || string == null) {
				System.out.println("The page doesn't contain status code");
				int parseInt = Integer.parseInt(INDEX);
				ExcelUtils.writeinexcel(" The page doesn't contain status code ", parseInt);
			}
			// Fetching and Printing the response code obtained
			else {
				System.out.println(Articles_URL + " - " + responseCode + " ==> " + responseMessage);
				int parseInt = Integer.parseInt(INDEX);
				ExcelUtils.writeinexcel(responseCode + " ==> " + responseMessage, parseInt);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}