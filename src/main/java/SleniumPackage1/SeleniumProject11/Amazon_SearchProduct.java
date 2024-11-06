package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchProduct 
{
	WebDriver driver;
@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement SearchField;

public void search_Field()
{
	SearchField.sendKeys("shoes for women sandals");
	SearchField.sendKeys(Keys.ENTER);
}

	public Amazon_SearchProduct(WebDriver driver) 
	{	
		PageFactory.initElements(driver, this);
	}
	
}		
	
