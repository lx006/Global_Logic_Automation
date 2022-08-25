import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/laxmi.dawane/Desktop/login.html");
		JavascriptExecutor jav =(JavascriptExecutor) driver;
		String stmt = "document.getElementById('fname').value='Laxmi'";
		jav.executeScript(stmt);
		String stmt1 = "document.getElementById('lname').click()";
		jav.executeScript(stmt1);

	}

}
