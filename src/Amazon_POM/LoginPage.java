package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submitBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String str)
	{
		email.sendKeys(str);
	}
	public void enterPassword(String str)
	{
		password.sendKeys(str);
	}
	public void clickSignin()
	{
		signIn.click();
	}
	public void clickContinue()
	{
		continueBtn.click();
	}
	public void clickSubmit()
	{
		submitBtn.click();
	}

}
