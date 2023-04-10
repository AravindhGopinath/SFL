package org.run;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class broken extends BaseClass {

	String homePage = "https://www.shriram.com/";
	String url = "";
	HttpURLConnection huc = null;
	int responseCode = 200;

	@Test
	public void executeee() {

		launchBrowser("chrome");

		loadUrl("https://www.shriram.com/");

		String[] tagname = { "a", "img", "script", "link" };

		for (String ki : tagname) {

			List<WebElement> links = driver.findElements(By.tagName(ki));

			for (WebElement link : links) {

				String[] attname = { "href", "src", "data-src" };

				for (String gi : attname) {

					String attribute = link.getAttribute(gi);
					//
					// System.out.println(attribute);

					Iterator<WebElement> it = links.iterator();

					while (it.hasNext()) {

						url = it.next().getAttribute(gi);

						// System.out.println(attribute2);

						if (url == null || url.isEmpty()) {

							System.out.println(url + "URL is either not configured for anchor tag or it is empty");
							continue;
						}

						if (!url.startsWith(homePage)) {
							System.out.println(url + "URL belongs to another domain, skipping it.");
							continue;
						}

						try {
							huc = (HttpURLConnection) (new URL(url).openConnection());

							huc.setRequestMethod("HEAD");

							huc.connect();

							responseCode = huc.getResponseCode();

							// System.out.println(responseCode);

							if (responseCode >= 300) {
								System.out.println(url + " is a broken link");
							} else {
								System.out.println(url + " is a valid link");
							}

						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					driver.quit();
				}
			}

		}
		// driver.quit();

	}
}
