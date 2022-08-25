import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("cuid123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(5000);
		a.accept();
		Thread.sleep(1000);
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		Thread.sleep(5000);
		b.accept();

	}

}
