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

public class Articles_GetText extends BaseClass {

	static List<String> data = new ArrayList<String>();

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public void verifyLink(String INDEX, String Slug_URL) throws Throwable {

		try {

			launchBrowser("chrome");

			loadUrl("https://beta.shriram.com/article-premature-withdrawal-of-fixed-deposit-and-effect-on-interest-calculation");

			WebElement Particular_div = driver.findElement(By.xpath("//div[@class='eligi_bility']"));

			List<WebElement> links = Particular_div.findElements(By.tagName("a"));

			for (WebElement we : links) {

				String Text = we.getText();
				

				String attribute_link = we.getAttribute("href");

				String print = Text + " ==>> " + attribute_link;
				
//				String print = attribute_link + " ==>> " + Text;
				
				System.out.println(print);

//				 data.add(print);

			}

//			 String join = String.join(", "+"\n", data );
//			 System.out.println(join);
//			 int parseInt = Integer.parseInt(INDEX);
//			 ExcelUtils.writeinexcel(join, parseInt);
//			 data.clear();

		} catch (Exception e) {

			e.printStackTrace();
		}

		driver.quit();
	}
}