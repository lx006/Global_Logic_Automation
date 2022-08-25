import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		String scrolldown = "window.scrollBy(0,1000)";
		j.executeScript(scrolldown);
		Thread.sleep(10000);
		String scrollup = "window.scrollBy(0,-1000)";
		j.executeScript(scrollup);
		
	}

}
