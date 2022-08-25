package Amazon_POM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy(xpath="//span[@id='productTitle']")
	private WebElement productName;
	
	@FindBy(xpath="//div[@id='apex_desktop']/.//span[@class='a-price-whole']")
	private WebElement productPrice;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocartBtn;
	
	public AddToCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void switchWindow(WebDriver driver)
	{
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
	    for(String windowHandle  : handles)
	    {
    		if(!windowHandle.equals(parentWindow))
    		{
    			driver.switchTo().window(windowHandle);

    			break;
    		}
	     }
	}
	
	public String getProductname()
	{
		return productName.getText();
	}
	
	public String getProductprice()
	{
		return productPrice.getText();
	}
	
	public void clickaddtocartBtn()
	{
		addtocartBtn.click();
	}

}
