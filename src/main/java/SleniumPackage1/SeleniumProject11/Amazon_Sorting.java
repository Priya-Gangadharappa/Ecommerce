package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Sorting {
	WebDriver driver;
	@FindBy(id="s-result-sort-select")
	   WebElement Sort;
	public void Sorting() throws InterruptedException
	{
		for(int i=0;i<=5;i++)
		{
			 Select S1= new Select(Sort);	 
			 S1.selectByIndex(i); 
			 Thread.sleep(1000);
		}
	}
	public Amazon_Sorting(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
	}
}
