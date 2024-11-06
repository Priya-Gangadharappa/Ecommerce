package SleniumPackage1.SeleniumProject11;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_To_Amazon extends Launch_Quit
{
 //WebDriver driver;
 @Test(retryAnalyzer=Amazon_RetryTestcase.class)
 public void Login_Amazon() throws InterruptedException
 {
	 
	 Amazon_HomePage Amazon=new Amazon_HomePage(driver);
		Amazon.AccountAndList(driver);
		Amazon.SignInClick();
	 Amazon_LoginPage L1=new Amazon_LoginPage(driver);
	  L1.EmailId();
	    L1.ContButton();
	    L1.Password(); 
	    L1.login(); 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 


	//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India:Shop Online for Mobiles, Books, Watches, Shoes and More -Amazon.in", "Online Shopping site in India:Shop Online for Mobiles, Books, Watches, Shoes and More -Amazon.in");
	 
 }
}
