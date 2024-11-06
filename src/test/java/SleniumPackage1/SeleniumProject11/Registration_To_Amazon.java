package SleniumPackage1.SeleniumProject11;
import java.io.IOException;

import org.testng.annotations.Test;// ctrl+shift+o
public class Registration_To_Amazon extends Launch_Quit
{
	@Test
//@Test(retryAnalyzer=SeleniumPackage1.SeleniumProject11.Amazon_RetryTestcase.class)
public void Create_new_Account() throws IOException
{
		Amazon_HomePage Amazon=new Amazon_HomePage(driver);
		Amazon.AccountAndList(driver);
		Amazon.SignInClick();
		
	Amazon_RegistrationPage R1=new Amazon_RegistrationPage(driver);
	R1.CreateNewAccount();
	R1.Your_Name();
	R1.MobileNumber();
	R1.PasswordRegistration();
	R1.Verify_Mobile_Number();
}
}
