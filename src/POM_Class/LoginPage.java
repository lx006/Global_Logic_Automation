package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	
	@FindBy(id="txtUsername")
	private WebElement inputTextname;
	
	@FindBy(id="txtPassword")
	private WebElement inputTextPassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement btnLogin;
	
	//Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void enterUsername(String str)
	{
		inputTextname.sendKeys(str);
	}
	
	public void enterPassword(String str)
	{
		inputTextPassword.sendKeys(str);
	}
	
	public void clickButton()
	{
		btnLogin.click();
	}
	

}
