import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/laxmi.dawane/Desktop/doubleclick.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement doubleclick=driver.findElement(By.xpath("//p[@id='demo']"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).perform();
	}

}
