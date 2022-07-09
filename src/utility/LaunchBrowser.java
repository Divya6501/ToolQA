package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		
		LaunchBrowser.launchBrowser();
		
		LaunchBrowser.launchApplication();
	
	}
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Git\\ToolQA\\driver\\chromedriver.exe" );
		
		 driver=new ChromeDriver();			
					
	}
	
	public static void launchApplication()
	{
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	

}
