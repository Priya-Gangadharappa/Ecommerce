package SleniumPackage1.SeleniumProject11;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
@Listeners(Amazon_Listener.class)
public class Launch_Quit extends Amazon_Listener
{
	
	//WebDriver driver;
	
	@BeforeMethod
	public void Launch()
	{
	//ChromeOptions co= new ChromeOptions();
	//co.addArguments("--headless");
	driver=new ChromeDriver();
	driver.get("https://www.Amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//@Test(retryAnalyzer=Amazon_RetryTestcase.class)
	
@AfterMethod
public void quit() throws IOException
{	
//driver.quit();
}
}
