package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTxtbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement selectItem;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchitem(String str)
	{
		searchTxtbox.sendKeys(str);
	}
	
	public void clickSearchBtn()
	{
		searchBtn.click();
	}
	public void clickItem()
	{
		selectItem.click();
	}
}
