package SleniumPackage1.SeleniumProject11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOut_Amazon extends Launch_Quit
{ 
	
@Test
public void Proceedtochekout() throws InterruptedException 
{

		Amazon_Reachtocart AR1=new Amazon_Reachtocart(driver);
		AR1.SearchField1();
	    AR1.Prodct1();
	    Set<String> s1=driver.getWindowHandles();
	    Iterator i1=s1.iterator();
	   String Parentid3=(String) i1.next();
	   String childid3=(String) i1.next();
	   System.out.println(Parentid3);
	   System.out.println(childid3);
	   driver.switchTo().window(childid3);
	   AR1.AddToCart4();
	   
	Amazon_UpdatingItemQuantity u1=new Amazon_UpdatingItemQuantity(driver);
	u1.Gotocart();
	
	Amazon_CheckOut AC1=new Amazon_CheckOut(driver);
	AC1.Proceed();
	AC1.Email_phoneno();
	AC1.continuecheckout();
	AC1.passwordcheckout();
	AC1.sigincheckout();
	AC1.Address();
	AC1.UseTHISAddressA();  
    //AC1.BuyNow();
   AC1.CreditCardSelection(); 
   AC1.CardDetails();
   AC1.Switch(driver); 
   AC1.CardNumber();
   AC1.EnterDetails();
   AC1.CancelButton();
   AC1.CashOnDelivery();
   AC1.PaymentClick();
  Assert.assertEquals(driver.getTitle(),"Amazon.in Checkout");	
	//AC1.ChangePayA();
	//AC1.payonDelivery();
	//AC1.ReviewOrder();
	
}	
}

