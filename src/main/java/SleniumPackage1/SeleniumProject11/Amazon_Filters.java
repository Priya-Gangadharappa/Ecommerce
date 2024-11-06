package SleniumPackage1.SeleniumProject11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Filters 
{
	WebDriver driver;
@FindBy(xpath="(//span[@class='a-list-item'])[2]/a/span")
WebElement TodayDealdilter;

@FindBy(xpath="(//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']/span/span)[5]")
WebElement Brand;
@FindBy(xpath="(//span[@class='a-button a-button-normal a-button-toggle a-button-small aok-float-left buttonsprite'])[9]")
WebElement Size;

@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
WebElement Rating;

@FindBy(linkText="Women's Fashion Sandals")
WebElement Category;

@FindBy(xpath="//input[@class='a-button-input']")
WebElement price;

@FindBy(xpath="//li[@id='p_n_availability/1318485031']/span/a/div/label/i")
WebElement Availability;

//@FindBy(xpath="(//div[@class='s-image-padding'])[1]")
//WebElement Result;

public void TodaysDealLink() 
{
	TodayDealdilter.click();
}

public void BrandFilter1()
{
	Brand.click();
	if(Brand.isSelected()&&Brand.isEnabled())
	{
		System.out.println("Select the Brand");
	}
	else 
	{
		System.out.println("Brand not selected");
	}
}
public void SizeFilter()
{
	Size.click();
}
public void RatingFilter() throws InterruptedException
{Thread.sleep(2000);
	if(Rating.isDisplayed())
	{
		System.out.println("Rating displayed");
	}
	else
	{
		System.out.println("Rating not displayed");
	}
}

public void CategoryFilter()
{
	Category.click();
}
public void priceRange()
{
	price.click();
}
public void Available()
{
	Availability.click();
	if(Availability.isSelected())
	{
		System.out.println("Available");
	}
	else
	{
		System.out.println("not available");
	}
}

/*public void Resultpage()
{
	Result.click();
}*/
public Amazon_Filters(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);
	}



}
