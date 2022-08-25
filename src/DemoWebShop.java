import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("cseiia@rgcer.edu.in");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("laxmipihu");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		WebElement element = driver.findElement(By.linkText("COMPUTERS"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Notebooks")).click();
		
		WebElement selectobj=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(selectobj);
		List<WebElement> sort = sel.getOptions();
		int sizeopt = sort.size();
		System.out.println("number of options in sort by are "+sizeopt);
		for(int i=0;i<sizeopt;i++)
		{
			WebElement text = sort.get(i);
			String str = text.getText();
			System.out.println(str);
		}
		Set<String> sortby = new TreeSet<>();
		for(int i=0;i<sizeopt;i++)
		{
			WebElement text = sort.get(i);
			String str = text.getText();
			sortby.add(str);
		}
		System.out.println("List in sorted form is "+sortby);
		sel.selectByIndex(3);
		System.out.println("---------------------------------------------------------------------------------");
		
		WebElement selectobj0=driver.findElement(By.id("products-pagesize"));
		Select sel0=new Select(selectobj0);
		List<WebElement> sort0 = sel0.getOptions();
		int sizeopt0 = sort0.size();
		System.out.println("number of options in sort by are "+sizeopt0);
		for(int i=0;i<sizeopt0;i++)
		{
			WebElement text = sort0.get(i);
			String str = text.getText();
			System.out.println(str);
		}
		Set<Integer> pagesize = new TreeSet<>();
		for(int i=0;i<sizeopt0;i++)
		{
			WebElement text = sort0.get(i);
			String str = text.getText();
			int k = Integer.parseInt(str);
			pagesize.add(k);
		}
		System.out.println("List in sorted form is "+pagesize);
		sel0.selectByIndex(2);
		System.out.println("---------------------------------------------------------------------------------");
		
		WebElement selectobj1=driver.findElement(By.id("products-viewmode"));
		Select sel1=new Select(selectobj1);
		List<WebElement> sort1 = sel1.getOptions();
		int sizeopt1 = sort1.size();
		System.out.println("number of options in sort by are "+sizeopt1);
		for(int i=0;i<sizeopt1;i++)
		{
			WebElement text = sort1.get(i);
			String str = text.getText();
			System.out.println(str);
		}
		Set<String> viewas = new TreeSet<>();
		for(int i=0;i<sizeopt1;i++)
		{
			WebElement text = sort1.get(i);
			String str = text.getText();
			viewas.add(str);
		}
		System.out.println("List in sorted form is "+viewas);
		sel1.selectByIndex(1);
		System.out.println("---------------------------------------------------------------------------------");
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		
		
		/*WebElement element = driver.findElement(By.linkText("ELECTRONICS"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Camera, photo")).click();
		driver.findElement(By.linkText("1MP 60GB Hard Drive Handycam Camcorder")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.xpath("//input[@name='FriendEmail']")).sendKeys("hrk123@gmail.com");
		//driver.findElement(By.xpath("//input[@name='YourEmailAddress']")).sendKeys("lx456@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='PersonalMessage']")).sendKeys("Hey, sending you the superb camera link");
		driver.findElement(By.xpath("//input[@name='send-email']")).click();*/
		
		
	}

}
