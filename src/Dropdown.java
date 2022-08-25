import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/laxmi.dawane/Desktop/Dropdown.html");
		WebElement selectobj=driver.findElement(By.id("slv"));
		Select sel=new Select(selectobj);
		Thread.sleep(10000);
		sel.selectByIndex(1);
		sel.selectByValue("j");
		Thread.sleep(10000);
		sel.selectByVisibleText("Workbook");
		List<WebElement> alloptions=sel.getOptions();
		int count=alloptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			sel.selectByIndex(i);
		}
		//print all options
		for(int i=0;i<count;i++)
		{
			WebElement text = alloptions.get(i);
			String str = text.getText();
			System.out.println(str);
		}
		
		//removing duplicate values
		Set<String> list = new TreeSet<>();
		for(int i=0;i<count;i++)
		{
			WebElement text = alloptions.get(i);
			String str = text.getText();
			list.add(str);
		}
		System.out.println(list);
		
		
		
		//print first selected option
		WebElement o = sel.getFirstSelectedOption();
		String str = o.getText();
		System.out.println("Selected option is "+str);
		
		
		//get all selected option
		/*WebElement selectobj1=driver.findElement(By.id("slv"));
		Select sel=new Select(selectobj1);
		if(sel.isMultiple()){
			
			//Selecting multiple values by index
			sel.selectByIndex(1);
			sel.selectByIndex(2);
		}
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		int count1=selectedOptions.size();
		System.out.println(count1);
		for(int i=0;i<count1;i++)
		{
			WebElement text =selectedOptions.get(i);
			String str1 = text.getText();
			System.out.println(str1);
		}*/
		

	}

}
