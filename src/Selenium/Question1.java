package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("file:///C:/Users/laxmi.dawane/Desktop/Alert.html");
		driver.get("file:///C:/Users/laxmi.dawane/Desktop/noAlert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println(isAlertPresent(driver));
		
	}
	
	public static boolean isAlertPresent(WebDriver drv) throws IOException{
	    boolean foundAlert = false;
	    WebDriverWait wait = new WebDriverWait(drv, 0);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        foundAlert = true;
	        Alert a = drv.switchTo().alert();
	        a.accept();
	    } catch (Exception eTO) {
	        foundAlert = false;
	        TakesScreenshot t =(TakesScreenshot) drv;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Alert1.png");
			FileUtils.copyFile(src, dest);
	    }
	    return foundAlert;
	}


}
