package SleniumPackage1.SeleniumProject11;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Coupon_Amazon extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_RetryTestcase.class)
	public void Coupon() throws InterruptedException
	{
	Amazon_HomePage Amazon=new Amazon_HomePage(driver);
	Amazon.AccountAndList(driver);
	Amazon.SignInClick();
   Amazon_LoginPage L1=new Amazon_LoginPage(driver);
   L1.EmailId();
   L1.ContButton();
   L1.Password(); 
   L1.login(); 
  
  Amazon_SearchProduct As1=new Amazon_SearchProduct(driver);
  As1.search_Field();
  
  Amazon_ProductDetails Ap=new Amazon_ProductDetails(driver);
	 Ap.Product_click();
	/* Set<String> s2=driver.getWindowHandles();
	    Iterator<String> i2=s2.iterator();
	   String Parentid4=(String) i2.next();
	   String childid4=(String) i2.next();
	   System.out.println(Parentid4);
	   System.out.println(childid4);
	   driver.switchTo().window(childid4);
	   Ap.Product_Information();*/
	   
	    Amazon_Reachtocart AR1=new Amazon_Reachtocart(driver);
		AR1.SearchField1();
	    AR1.Prodct1();
	    Set<String> s1=driver.getWindowHandles();
	    Iterator<String> i1=s1.iterator();
	   String Parentid3=(String) i1.next();
	   String childid3=(String) i1.next();
	   System.out.println(Parentid3);
	   System.out.println(childid3);
	   driver.switchTo().window(childid3);
	   AR1.AddToCart4();
	   Amazon_CheckOut AC1=new Amazon_CheckOut(driver);
		AC1.Proceed();
		/*AC1.Email_phoneno();
		AC1.continuecheckout();
		AC1.passwordcheckout();
		AC1.sigincheckout();
		AC1.Address();*/
		AC1.UseTHISAddressA();
	//	AC1.ChangePayA();
	//	AC1.payonDelivery();
		//AC1.ReviewOrder(); 
	    //AC1.BuyNow();
	   
		//AC1.ChangePayA();
		//AC1.payonDelivery();
		//AC1.ReviewOrder();
	   Amazon_Coupon Ac1=new Amazon_Coupon(driver);
	   Ac1.Promotion_Code("09876");
	   Ac1.Apply_button();
	   Assert.assertTrue(Ac1.Apply.isDisplayed()&& Ac1.Apply.isEnabled());
	}
}
