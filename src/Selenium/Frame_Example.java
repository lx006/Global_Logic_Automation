package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/laxmi.dawane/Desktop/Page1.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("fn")).sendKeys("Laxmi");
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("Kailash");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("Dawane");
		
	}

}
