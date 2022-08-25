package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Login']")).click();
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
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("Pranali@email.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("laxmipranali");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Actions actions = new Actions(driver); 
		actions.moveToElement(driver.findElement(By.linkText("RECRUITERS"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Recruiter Connection"))).click().perform();
		String parentWindow1 = driver.getWindowHandle();
		Set<String> handles1 =  driver.getWindowHandles();
	    for(String windowHandle  : handles1)
	    {
    		if(!windowHandle.equals(parentWindow1))
    		{
    			driver.switchTo().window(windowHandle);

    			break;
    		}
	     }
	    System.out.println(driver.getTitle());
	    if(driver.getTitle().contains("Naukri FastForward"))
	    {
	    	Thread.sleep(1000);
	    	actions.moveToElement(driver.findElement(By.linkText("MY SERVICES"))).click().perform();
	    }
	    else
	    {
	    	System.out.println("Title of the web page didn't matched");
	    }
			
	}

}
