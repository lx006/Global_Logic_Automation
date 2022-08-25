import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Orange {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		/*WebElement element = driver.findElement(By.xpath("//b[text()='PIM']"));
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		//Performing the mouse hover action on the target element.
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kalyani");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Pendke");
		WebElement UploadImg = driver.findElement(By.xpath("//input[@id='photofile']"));
		UploadImg.sendKeys("D:\\Amazon.png");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();*/
		
		
		WebElement element = driver.findElement(By.xpath("//b[text()='Admin']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		WebElement selectobj=driver.findElement(By.id("systemUser_userType"));
		Select sel=new Select(selectobj);
		sel.selectByVisibleText("Admin");
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Harry Kane");
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("harry125");
		WebElement selectobj1=driver.findElement(By.id("systemUser_status"));
		Select sel1=new Select(selectobj1);
		sel1.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Harry@1234_5678");
		driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("Harry@1234_5678");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='btnSave']")).click();
		
	}

}
