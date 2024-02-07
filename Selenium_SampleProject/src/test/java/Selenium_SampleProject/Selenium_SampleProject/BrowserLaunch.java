package Selenium_SampleProject.Selenium_SampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch 
{
	public static WebDriver driver;

    
   @Test(priority=1)
   public void browserlauch() {
	  driver=new ChromeDriver();
	  driver.get("https://www.youtube.com/");
   }
   
   @Test(priority=2)
   public void maximizeWindow() {
	   driver.manage().window().maximize();
   }
   
   @Test(priority=3)
   public void exit() {
	   driver.quit();
   }
}
