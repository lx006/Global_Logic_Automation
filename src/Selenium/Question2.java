package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/laxmi.dawane/Desktop/Alert.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("problem_user");
        //driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        //Thread.sleep(1000);
        WebElement el = driver.findElement(By.xpath("//button[@type='button']"));
        WebDriverWait wt = new WebDriverWait(driver,6);
        try {
    		wt.until(ExpectedConditions.elementToBeClickable(el));
    		el.click();
    	    System.out.println("Current page title:" + driver.getTitle());	
		} catch (Exception e) 
        {
			System.out.println("Element is not clickable");
			 TakesScreenshot t =(TakesScreenshot) driver;
		      File src = t.getScreenshotAs(OutputType.FILE);
			  File dest = new File("D:\\click.png");
			  FileUtils.copyFile(src, dest);
		}
        
        
        
		

	}

}
