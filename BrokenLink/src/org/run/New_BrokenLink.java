package org.run;

public class New_BrokenLink {
	 public static void main(String[] args, String linkUrl) {

		 	WebDriver driver =new ChromeDriver();
		 
	        WebDriverManager.chromedriver().setup();

	        List<WebElement> links = (List<WebElement>) driver.findElement(By.tagName("a"));

	        System.out.println("No of links are" + links.size());

	        List<String> urlList = new ArrayList<String>();

	        for (WebElement e : links) {

	            String url = e.getAttribute("href");
//	            urlList.add(url);
	            checkBrokenLink(url);

	        }

	        driver.quit();

	    }
	        public static void checkBrokenLink(String linkUrl){

	            try {

	                URL url = new URL(linkUrl);
	                HttpURLConnection HttpurlConnection = (HttpURLConnection) url.openConnection();
	                HttpurlConnection.setConnectTimeout(5000);
	                HttpurlConnection.connect();

	                if (HttpurlConnection.getResponseCode()>= 400) {

	                    System.out.println(linkUrl+"-->"+HttpurlConnection.getResponseMessage()+"is a broken link");

	                }
	                else {
	                    System.out.println(linkUrl+"-->"+HttpurlConnection.getResponseMessage());

	                }
	            }

	            catch (Exception e){

	            }
	        }


}
