package POM_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement admin;
	
	@FindBy(linkText="User Management")
	private WebElement userManagement;
	
	@FindBy(linkText ="Users")
	private WebElement users;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement addBtn;
	
	@FindBy(id="systemUser_userType")
	private WebElement userType;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	private WebElement empName;
	
	@FindBy(xpath="//input[@id='systemUser_userName']")
	private WebElement userName;
	
	@FindBy(id="systemUser_status")
	private WebElement status;
	
	@FindBy(xpath="//input[@id='systemUser_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='systemUser[confirmPassword]']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='btnSave']")
	private WebElement saveBtn;
	
	public AddUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void moveAdmin(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(admin).perform();
	}
	public void clickUserManagement()
	{
		userManagement.click();
	}
	public void clickUsers()
	{
		users.click();
	}
	public void clickAddBtn()
	{
		addBtn.click();
	}
	public void selectUsertype(String str)
	{
		WebElement selectobj = userType;
		Select sel=new Select(selectobj);
		sel.selectByVisibleText(str);
	}
	public void inputEmpName(String str)
	{
		empName.sendKeys(str);
	}
	public void inputUserName(String str)
	{
		userName.sendKeys(str);
	}
	public void selectStatus(int n)
	{
		WebElement selectobj = status;
		Select sel=new Select(selectobj);
		sel.selectByIndex(n);
	}
	public void inputPassword(String str)
	{
		password.sendKeys(str);
	}
	public void inputConfirmPswd(String str)
	{
		confirmPassword.sendKeys(str);
	}
	public void clickSave()
	{
		saveBtn.click();
	}
	
	
}
