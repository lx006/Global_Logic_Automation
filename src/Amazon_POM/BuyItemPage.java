package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyItemPage {
	
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")
	private WebElement proceedCheckout;
	
	@FindBy(xpath="//a[@data-action='page-spinner-show']")
	private WebElement deliverBtn;
	
	@FindBy(xpath="//input[@name='ppw-instrumentRowSelection']")
	private WebElement radioBtn;
	
	@FindBy(linkText ="Add a credit or debit card")
	private WebElement addCard;
	
	@FindBy(xpath="//iframe[contains(@name,'ApxSecureIframe')]")
	private WebElement switchFrame;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement cardNumber;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	private WebElement addCardbtn;
	
	public BuyItemPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickCheckoutbtn()
	{
		proceedCheckout.click();
	}
	public void clickDeliverbtn()
	{
		deliverBtn.click();
	}
	public void clickRadiobtn()
	{
		radioBtn.click();
	}
	public void clickaddCard()
	{
		addCard.click();
	}
	public void switchframe(WebDriver driver)
	{
		driver.switchTo().frame(switchFrame);
	}
	public void inputCardno(String str)
	{
		cardNumber.sendKeys(str);
	}
	public void clickAddcardbtn()
	{
		addCardbtn.click();
	}
}
