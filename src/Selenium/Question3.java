package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		String scrolldown = "window.scrollBy(0,1000)";
		Thread.sleep(10000);
		j.executeScript(scrolldown);
		driver.findElement(By.xpath("//img[@alt='Java']/../..//a[text()='4.3.0 (June 23, 2022)']")).click();
		
	}

}
