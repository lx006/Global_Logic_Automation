package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DevWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		/*driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@value='F']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Laxmi");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Dawane");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("cseiia@rgcer.edu.in");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("laxmipihu");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("laxmipihu");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(1000);*/
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("cseiia@rgcer.edu.in");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("laxmipihu");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.findElement(By.linkText("COMPUTERS")).click();
		driver.findElement(By.linkText("Notebooks")).click();
		driver.findElement(By.xpath("//img[@title='Show details for 14.1-inch Laptop']/../../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//select[@name='CountryId']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='ZipPostalCode']")).sendKeys("440022");
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*driver.findElement(By.xpath("//select[@name='BillingNewAddress.CountryId']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.City']")).sendKeys("Raipur");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.Address1']")).sendKeys("Plot no.05 Kashi nagar, Raipur");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']")).sendKeys("440022");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']")).sendKeys("1234567893");
		driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();*/
		
	}

}
