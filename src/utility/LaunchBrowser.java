package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		launchBrowser();
	}
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Git\\ToolQA\\driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
	}
	

}
