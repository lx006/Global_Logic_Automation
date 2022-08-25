import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//p[text()='Selenium Server (Grid)']"));
		System.out.println(element.getText());*/
		
		/*driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		boolean v = element.isEnabled();
		System.out.println(v);*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("QSpiders");
		//String path = "//span[contains(text(),'QSpiders')]";
		List<WebElement> elements = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		//Thread.sleep(10000);
		int count = elements.size();
		//Thread.sleep(10000);
		System.out.println(count);
		//Thread.sleep(10000);
		for(int i=0;i<count;i++)
		{
			Thread.sleep(10000);
			WebElement text = elements.get(i);
			Thread.sleep(10000);
			String str = text.getText();
			System.out.println(str);
		}
		
		
	}

}
