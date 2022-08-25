import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("problem_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        
        //driver.findElement(By.xpath("//div[@class='cart_quantity']]")).sendKeys("2");
        
        
        
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-test='firstName']")).sendKeys("plabani");
        driver.findElement(By.xpath("//input[@data-test='lastName']")).sendKeys("mojumder");
        driver.findElement(By.xpath("//input[@data-test='postalCode']")).sendKeys("440015");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-test='continue']")).click();
    
	}

}
