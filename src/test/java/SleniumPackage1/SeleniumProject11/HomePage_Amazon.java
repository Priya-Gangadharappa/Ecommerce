package SleniumPackage1.SeleniumProject11;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class HomePage_Amazon extends Launch_Quit
{
	//WebDriver driver;
	@Test
	public void HomePage()
	{
	Amazon_HomePage Amazon=new Amazon_HomePage(driver);
	Amazon.AccountAndList(driver);
	//Amazon.SignInClick(); 



	}
}
