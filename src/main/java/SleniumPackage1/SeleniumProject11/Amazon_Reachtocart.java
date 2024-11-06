package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Reachtocart 
{
WebDriver driver;
@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement SearchField;

@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
WebElement Product;

@FindBy(id="add-to-cart-button")
WebElement Addcart;

public void SearchField1() 
{
	SearchField.sendKeys("shoes for women sandals");
	SearchField.sendKeys(Keys.ENTER);
}
public void Prodct1() 
{
	Product.click();
}

public void AddToCart4()
{
	Addcart.click();
}
	public Amazon_Reachtocart(WebDriver driver) 
	{	
		PageFactory.initElements(driver, this);
	}
	
}
