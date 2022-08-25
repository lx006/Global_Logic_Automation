import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		/*driver.get("file:///C:/Users/laxmi.dawane/Desktop/dragdrop.html");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("dragData"));
		WebElement targ = driver.findElement(By.id("getData"));
		act.dragAndDrop(source, targ).perform();
		
		String textTo = targ.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	
		driver.close();*/
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement double1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.doubleClick(double1).perform();
		
		
	}

}
