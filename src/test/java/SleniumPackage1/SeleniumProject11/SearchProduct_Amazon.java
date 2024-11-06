package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchProduct_Amazon extends Launch_Quit
{
	//WebDriver driver;
 @Test
 public void Search()
 {
	 Amazon_SearchProduct As1=new Amazon_SearchProduct(driver);
	 As1.search_Field();	
 }
}
