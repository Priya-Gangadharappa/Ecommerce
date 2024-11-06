package SleniumPackage1.SeleniumProject11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Amazon_ProductDetails 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='a-size-base-plus a-color-base a-text-normal']")
	 WebElement Product;
	 @FindBy(xpath="//div[@id='averageCustomerReviews']")  
	  WebElement Review;
	 @FindBy(xpath="//div[@id='corePriceDisplay_desktop_feature_div']")
	 WebElement Price;
	 @FindBy(xpath="//h3[.=' Product details ']")
	 WebElement ProductDetails;
	 @FindBy(xpath="(//h3[@class='product-facts-title'])[2]")
	 WebElement AboutProduct;
	 @FindBy(xpath="//div[@id='productDescription_feature_div']")
	 WebElement ProductDescription;
	 
	 public void Product_click() 
	 {
		 Product.click();
	 }
	  public void Product_Information()
	 {
		 
		if(Review.isDisplayed()&& Price.isDisplayed()&&ProductDetails.isDisplayed()&&AboutProduct.isDisplayed()&&ProductDescription.isDisplayed())
		{
			System.out.println("All necessary information displayed on the product detail page");
		}
		else
		{
			System.out.println("Sorry");
		}
	 }
public Amazon_ProductDetails(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
}
