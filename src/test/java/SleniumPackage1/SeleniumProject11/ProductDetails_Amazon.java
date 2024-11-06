package SleniumPackage1.SeleniumProject11;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;
public class ProductDetails_Amazon extends Launch_Quit
{
@Test
public void Product_Details() throws InterruptedException
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
	 Thread.sleep(2000);
	 Ap.Product_Information();
	 
}
}
