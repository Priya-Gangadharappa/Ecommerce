package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderRating_Amazon extends Launch_Quit
{
@Test
public void RatingOnOrder() throws InterruptedException
{

	 Amazon_HomePage Amazon=new Amazon_HomePage(driver);
		Amazon.AccountAndList(driver);
		Amazon.SignInClick();
	 Amazon_LoginPage L1=new Amazon_LoginPage(driver);
	  L1.EmailId();
	    L1.ContButton();
	    L1.Password(); 
	    L1.login();  
	    Amazon_OrderRating AO1=new Amazon_OrderRating(driver);
	    AO1.Your_order();
	    AO1.Leave_Feadback();
	    Thread.sleep(1000);
/*	    AO1.Rating();
	    Thread.sleep(1000);
	    AO1.Submit_Rating(); */
	   String title= driver.getTitle();
	   Assert.assertEquals(title, "Delivery Feedback", "Rating is Pass");
}
}
