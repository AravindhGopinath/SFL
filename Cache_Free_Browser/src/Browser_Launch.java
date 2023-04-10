import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Launch {
	
	
	 public static void main(String args[]){
	       
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\a1354\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
	        
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("headless");
//	          options.setHeadless(true);
	        
	        WebDriver driver = new ChromeDriver(options);
	     
	        driver.get("https://www.google.com");
	        
	        System.out.println("Executing Chrome Driver in Headless mode..\n");
	 
	        System.out.println(">> Page Title : "+driver.getTitle());
	        
	        System.out.println(">> Page URL  : "+driver.getCurrentUrl());

	    }

}
