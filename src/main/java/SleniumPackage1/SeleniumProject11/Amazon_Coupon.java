package SleniumPackage1.SeleniumProject11;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Coupon {
	WebDriver driver;
	@FindBy(xpath="//div[@class='a-row a-spacing-top-small']/input")
	WebElement Code;
	@FindBy(xpath="//span[@class='a-button a-button-base pmts-claim-code-apply-button pmts-button-input']/span/input") 
	WebElement Apply;
	public void Promotion_Code(String number)
	{
	WebDriverWait w3 = new WebDriverWait(driver,Duration.ofSeconds(10)); 
	w3.until(ExpectedConditions.visibilityOf(Code));
	Code.sendKeys(number); 
	}
	public void Apply_button()
	{
	WebDriverWait w3 = new WebDriverWait(driver,Duration.ofSeconds(10)); 
	w3.until(ExpectedConditions.textToBePresentInElementValue(Code, "09876"));
	Apply.click();
	}
	public  Amazon_Coupon (WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}
	
}
