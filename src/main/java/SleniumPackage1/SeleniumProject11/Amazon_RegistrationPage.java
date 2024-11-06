package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_RegistrationPage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='a-button a-button-span12 a-button-base']")
	WebElement createbutton;
	@FindBy(name="customerName")
	WebElement Fname_Lname;
	
	@FindBy(id="ap_phone_number")
	WebElement Mobile_Number;
	
	@FindBy(name="password")
	WebElement Password_Registration;
	
	@FindBy(id="continue")
	WebElement Verify_Number;
	
	public void CreateNewAccount()
	{
		createbutton.click();
	}
	
	public void Your_Name()
	{
		Fname_Lname.sendKeys("PriyaGangadhar"+Keys.TAB);
	}
	public void MobileNumber()
	{
		Mobile_Number.sendKeys("7411088304"+Keys.TAB);
	}
	public void PasswordRegistration()
	{
		Password_Registration.sendKeys("Cybatron@1390");
	}
	public void Verify_Mobile_Number()
	{
		Verify_Number.click();
	}
	
	public Amazon_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
