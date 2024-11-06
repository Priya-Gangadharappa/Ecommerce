package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Filters_Amazon extends Launch_Quit
{
	//WebDriver driver;
	@Test
	public void Filter() throws InterruptedException
	{ 
		Amazon_SearchProduct As1=new Amazon_SearchProduct(driver);
		 As1.search_Field();
		 
		Amazon_Filters AF1=new Amazon_Filters(driver);
//	    AF1.TodaysDealLink();
//	    AF1.BrandFilter1();
	    AF1.SizeFilter();
//	    AF1.RatingFilter();
	    Thread.sleep(2000);
//	    AF1.CategoryFilter();
	    AF1.priceRange();
	    AF1.Available();
	    //AF1.Resultpage();
	}
}
