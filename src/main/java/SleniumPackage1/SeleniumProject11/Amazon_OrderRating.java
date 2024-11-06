package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_OrderRating 
{
WebDriver driver;
@FindBy(xpath="(//span[@class='nav-line-2'])[2]")
WebElement YourOrder;
@FindBy(xpath="//span[@id='a-autoid-7']")
WebElement LeaveYOURfedback;
@FindBy(xpath="(//div[@class='filledStar starRatings'])[4]")
WebElement Start;
@FindBy(xpath="//span[@id='a-autoid-0']")
WebElement Rating_submit;

public void Your_order()
{
	YourOrder.click();
}
public void Leave_Feadback()
{
	LeaveYOURfedback.click();
}
public void Rating()
{
	Start.click();
}
public void Submit_Rating()
{
	Rating_submit.click();
}
public Amazon_OrderRating(WebDriver driver) 
{
	PageFactory.initElements(driver, this);

}
}
