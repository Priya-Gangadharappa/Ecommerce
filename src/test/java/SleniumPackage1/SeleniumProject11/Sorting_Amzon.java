package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Amazon_Listener.class)
public class Sorting_Amzon extends Launch_Quit
{
	//WebDriver driver;
	@Test
	
	public void SortingTheProduct() throws InterruptedException
	{
		Amazon_SearchProduct As1=new Amazon_SearchProduct(driver);
		 As1.search_Field();	
		 Amazon_Sorting S1=new  Amazon_Sorting(driver);
	     S1.Sorting(); 
	}	
}
