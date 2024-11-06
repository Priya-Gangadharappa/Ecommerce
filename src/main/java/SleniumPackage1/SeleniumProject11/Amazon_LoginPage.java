package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPage 
{
	WebDriver driver; 
	@FindBy(name="email")
	WebElement Email;
	@FindBy(id="continue")
	WebElement Continue;
	@FindBy(name="password")
	WebElement Password; 
	@FindBy(id="signInSubmit")
	WebElement SignIn; 
 public void EmailId() 
 {
	 Email.sendKeys("7411088304"); 
 }
 public void ContButton()
 {
	 Continue.click();
 }
 public void Password()  
 {
	 Password.sendKeys("Doctor@9496");   
 }
 public void login()
 {
	 SignIn.click();
 }
	public Amazon_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
}
