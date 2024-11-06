package SleniumPackage1.SeleniumProject11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Amazon_AddtoCart
{
	WebDriver driver;
	
	  @FindBy(xpath="//input[@id='add-to-cart-button']") 
	  WebElement Add_to_cart;
	  
	  @FindBy(xpath="(//a[@class='a-button-text'])[3]") 
	  WebElement go_to_cart;
	  
	  @FindBy(name="email")
	  WebElement Mobile_number;
	  
	  @FindBy(id="continue")
	  WebElement continue1;
	  
	  @FindBy(name="password")
	  WebElement password;
	  
	  @FindBy(id="signInSubmit")
	  WebElement signin;
	  
	  @FindBy(xpath="//span[@class='a-button a-spacing-none a-button-primary a-button-icon']")
	  WebElement Addto_Cart;
	  
	  @FindBy(className = "a-truncate-cut")
	  WebElement ProductName;
	   
	  public WebElement ProductDisplay()
	  {
		  return ProductName;
	  }
	  public void AddProduct()
	  {
		Add_to_cart.click(); 
	  }
	  
	  public void GoProduct()
	  {
		go_to_cart.click(); 
	  }
	  
	  public void Mobilenumber()
	  {
		  Mobile_number.sendKeys("7411088304");
	  }
	  
	  public void continuee()
	  {
		  continue1.click();
	  }
	  
	  public void Password()
	  {
		  password.sendKeys("Doctor@9496"); 
	  }
	  
	  public void Signinn() 
	  {
		  signin.click();
	  }
	  
	  public void ADD()
	  {
		  Addto_Cart.click(); 
	  }
	  
	  public  Amazon_AddtoCart (WebDriver driver)  
	  {
		 PageFactory.initElements(driver, this); 

	  }

}
