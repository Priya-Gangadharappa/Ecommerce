package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage
{
	
	WebDriver driver;
	
		@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
		WebElement Account_List;
		@FindBy(xpath="//span[.='Sign in']") 
		WebElement Sign_In; 
    
		public void  AccountAndList(WebDriver driver) 
		{
			Actions a1=new Actions(driver); 
		     a1.moveToElement(Account_List).perform(); 
		}
		public void SignInClick()
		{
			Sign_In.click();
		}

 public Amazon_HomePage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

}