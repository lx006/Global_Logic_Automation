package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.134/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());*/
		
		/*driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close();*/
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//input[@value='LOGIN']"));
		System.out.println(driver.getTitle());
		driver.findElement(By.className("button")).click();
		//driver.findElement(By.className("buttons buyBtn")).click();
		
		
		/*WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/laxmi.dawane/Desktop/sample1.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Inbox")).click();*/
		
	}

}
