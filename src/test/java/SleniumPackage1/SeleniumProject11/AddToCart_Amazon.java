package SleniumPackage1.SeleniumProject11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart_Amazon extends Launch_Quit
{ //WebDriver driver;
@Test(retryAnalyzer=Amazon_RetryTestcase.class)
public void Addtocart() throws InterruptedException
{
	Amazon_SearchProduct As1=new Amazon_SearchProduct(driver);
	 As1.search_Field();	
	 
  
	 Amazon_ProductDetails Ap=new Amazon_ProductDetails(driver);
	 Ap.Product_click();
	 Set <String> S1= driver.getWindowHandles(); 
	 Iterator <String> i1=S1.iterator();
	 String parentid=i1.next();
	 String childid=i1.next();
     System.out.println(parentid);
     System.out.println(childid);
     driver.switchTo().window(childid);
	 Ap.Product_Information();
	 
	 Amazon_AddtoCart AA=new Amazon_AddtoCart(driver);
	 AA.AddProduct();
	 AA.GoProduct();
	 boolean productame= AA.ProductDisplay().isDisplayed();
	 Assert.assertEquals(productame, true, "Product is Displayed");
/*	 Thread.sleep(2000);
	 AA.Mobilenumber();
	 AA.continuee();
	 AA.Password();
	 AA.Signinn();
	 Set <String> S2= driver.getWindowHandles(); 
	 Iterator <String> i2=S2.iterator();
	 String parentid2=i2.next();
	 String childid2=i2.next();
     System.out.println(parentid2);
     System.out.println(childid2);
     driver.switchTo().window(childid2); */
	// AA.ADD(); 
	
}
}
