package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_CheckOut 
{
   WebDriver driver;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement Proceedtopay;
	
	@FindBy(name="email")
	WebElement Email_Mno;
	
	@FindBy(id="continue")
	WebElement contiu;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	@FindBy(xpath="//span[@class='a-label a-radio-label']")
	WebElement Radio_Address;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement UsethisAddressButton;
	
	@FindBy(xpath="//a[@id='payChangeButtonId']")
	WebElement Change;
	
	/*@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement CashonDeliveryRadioButton;
	
	@FindBy(xpath="//span[@id='pp-zpEfHj-138']")
	WebElement UseThisPayment;
	
	@FindBy(xpath="//div[@class='a-row shipping-group']")
	WebElement  Order;*/
	//@FindBy(xpath="//div[@id='buyNow']") 
	 //  WebElement Buy;
	   @FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	   WebElement PaymentSelection;
	   @FindBy(xpath="(//a[.='Enter card details'])[1]")
	   WebElement EnterCardDetails;
	   @FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	   WebElement frame1;
	   @FindBy(xpath="//input[@name='addCreditCardNumber']")
	   WebElement CCNumber;
	   @FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	   WebElement Enter;
	   @FindBy(xpath="//button[@name='ppw-widgetEvent:CancelAddCreditCardEvent']")
	   WebElement Cancel;
	   @FindBy(xpath="//input[@type='radio' and contains(@value, 'paymentMethod=COD')]")
	   WebElement Cash;
	   @FindBy(xpath="(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]") 
	   WebElement UseThisPaymentMethod;
	public void Proceed()
	{
		Proceedtopay.click();
	}
	public void Email_phoneno()
	{
		Email_Mno.sendKeys("7411088304");
	}
	public void continuecheckout()
	{
		contiu.click();
	}
	public void passwordcheckout()
	{
		pwd.sendKeys("Doctor@9496");
	}
	public void sigincheckout()
	{
		signin.click();
	}
	public void Address()
	{
		Radio_Address.click();
		if(Radio_Address.isSelected()&& Radio_Address.isEnabled())
		{
			System.out.println("Radio button should be selected and Enabled");
		}
		else
		{
			System.out.println("Radio is not Displayed and Enabled");
		}
	}
	public void UseTHISAddressA()
	{
		UsethisAddressButton.click();
	}
	
	public void ChangePayA()
	{
		Change.click();
	}
	
	/*public void payonDelivery() throws InterruptedException
	{   Thread.sleep(4000);
	   CashonDeliveryRadioButton.click();
		if (CashonDeliveryRadioButton.isSelected())
		 {
			 System.out.println("Cash on Delivery Selected");
			 
		}
		else 
		{
			System.out.println("Cash on Delivery Not Selected");
			}
		}
	public void PaymentMethod()
	{
		UseThisPayment.click();
	}
	
	public void ReviewOrder()
	{
		Order.click();
		if(Order.isEnabled()&& Order.isDisplayed())
		{
			System.out.println("Review order button is enables and displayed");
		}
		else
		{
			System.out.println("Review order button is not enabled and displayed");
		}*/
	 
	 /*  public void BuyNow()
	   {
		   Buy.click();
	   }*/
	   public void CreditCardSelection()  
	   {
		   PaymentSelection.click();  
		   }
	   public void CardDetails()
	   {
		   EnterCardDetails.click();
		   
	   }
	   public void Switch(WebDriver driver) 
	    { 
		   this.driver=driver;
		   driver.switchTo().frame(frame1); 
	   } 
	   public void CardNumber()
	   {
		   CCNumber.sendKeys("09765432123");
	   }
	   public void EnterDetails()
	   {
		   Enter.click();
		  
	   }
	   public void CancelButton()
	   {
		   Cancel.click();
		   driver.switchTo().defaultContent(); 
	   }
	   public void CashOnDelivery()
	   {
		   Cash.click();
	   }
	   
	   public void PaymentClick()
	   {
		   UseThisPaymentMethod.click();
		   }

	public Amazon_CheckOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
