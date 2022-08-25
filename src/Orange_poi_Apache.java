import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_poi_Apache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 0, 0);
		String password = ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 0, 1);
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laxmi.dawane\\\\eclipse-workspace\\\\Global_Logic_Automation\\\\src\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement el = driver.findElement(By.id("txtUsername"));
		el.sendKeys(username);
		WebElement el2 = driver.findElement(By.id("txtPassword"));
		el2.sendKeys(password);
	}

}
