package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EditProfile_Amazon extends Launch_Quit
{
	//WebDriver driver;
	@Test
	public void Edit()
	{
		
		Amazon_HomePage Amazon=new Amazon_HomePage(driver);
		Amazon.AccountAndList(driver);
		Amazon.SignInClick();
	 Amazon_LoginPage L1=new Amazon_LoginPage(driver);
	  L1.EmailId();
	    L1.ContButton();
	    L1.Password(); 
	    L1.login(); 
		 
		Amazon_EditProfile P= new Amazon_EditProfile(driver);  
		P.Account_Click();
		P.Account_Click();
		P.Edit();
		P.Edit_name();
		P.Change();
		P.Save_Change();
	}
}
