package SleniumPackage1.SeleniumProject11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_PaymentSelectionPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//span [@class='pmts-instrument-selector']")
	WebElement Credit_DebitCard; 
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[3]")
	WebElement NetBanking;
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[4]")
	WebElement UPI;
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[5]")
	WebElement EMI;
	@FindBy(xpath="//input[@type='radio' and contains(@value, 'paymentMethod=COD')]")
	WebElement CashOnDelivery;

 
	public void Credit_DebitCardpayment()  
	{
	   Credit_DebitCard.click();
	}

	public void Net_BankigPayment() 
	{
		NetBanking.click();
	}
	
	public void UPI_Payment()
	{
		UPI.click();
	}
	
	public void EMI_Payment()
	{
		EMI.click();
	}
	
	public void CashPay_Payment()
	{
	 CashOnDelivery.click(); 
	 if (CashOnDelivery.isSelected())
	 {
		 System.out.println("Cash on Delivery Selected");
		 
	 }
	 else 
	 {
		System.out.println("Cash on Delivery is Not Selected");
	 }
	 }
	 
	public Amazon_PaymentSelectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}

}
