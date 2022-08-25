package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/ldawane/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("cseiiia19@rgcer.edu.in");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("laxmipihu");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@data-for='baseTooltipId']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='containers-EnterTT-ETTTaskPanel-RecentTasksSection-TaskControl-title--2DeQtDr0']")).click();
		
		
	}

}
