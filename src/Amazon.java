import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8830932958");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("laxmipihu");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung galaxy m53");
		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'samsung galaxy m53')]"));
		int count = elements.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			
			WebElement text = elements.get(i);
			
			String str = text.getText();
			System.out.println(str);
		}
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
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
	    WebElement element = driver.findElement(By.xpath("//span[@id='productTitle']"));
	    System.out.println(element.getText());
	    element = driver.findElement(By.xpath("//div[@id='apex_desktop']/.//span[@class='a-price-whole']"));
	    System.out.println(element.getText());
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    //driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
	    driver.findElement(By.xpath("//a[@data-action='page-spinner-show']")).click();
	    //driver.findElement(By.xpath("//input[@name='continue-bottom']")).click();
	    driver.findElement(By.xpath("//input[@name='ppw-instrumentRowSelection']")).click();
	    driver.findElement(By.linkText("Add a credit or debit card")).click();
	    Thread.sleep(10000);
	    WebElement el = driver.findElement(By.xpath("//iframe[contains(@name,'ApxSecureIframe')]"));
	    driver.switchTo().frame(el);
	    //driver.switchTo().frame(0);
	    //driver.switchTo().frame(driver.findElement(By.id("pp-xGm4CV-13")));
	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234345634561234");
	    driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent']")).click();
	}

}
