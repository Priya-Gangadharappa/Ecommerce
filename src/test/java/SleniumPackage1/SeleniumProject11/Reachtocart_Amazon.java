package SleniumPackage1.SeleniumProject11;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Reachtocart_Amazon extends Launch_Quit
{
	@Test
   public void Reach_without_Login()
   {
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
   
	}
}
