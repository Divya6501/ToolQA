package utility;

import org.openqa.selenium.By;
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
		 
		 driver.manage().window().maximize();
					
	}
	
	public static void launchApplication()
	{
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Divya");
		 driver.findElement( By.xpath("//*[@id=\"userEmail\"]")).sendKeys("divyaanand163@mail.com");
		 driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("chennai");
		 driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("enough");
		 driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	
	

}
