package SleniumPackage1.SeleniumProject11;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_UpdatingItemQuantity 
{
WebDriver driver;

@FindBy(xpath="//span[@id='sw-gtc']")
WebElement gotocartbutton;

@FindBy(xpath="//select[@name='quantity']")
WebElement QuantityDropdown;

public void Gotocart()
{
	gotocartbutton.click();
}

public void Qtydropdown()
{
	Select s1=new Select(QuantityDropdown);
	s1.selectByIndex(5);
	s1.selectByIndex(0);
	}
	
public Amazon_UpdatingItemQuantity(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
