package Amazon_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//login page class
		LoginPage lp = new LoginPage(driver);
		lp.clickSignin();
		lp.enterEmail("8830932958");
		lp.clickContinue();
		lp.enterPassword("laxmipihu");
		lp.clickSubmit();
		
		//search item page class
		SearchPage search = new SearchPage(driver);
		search.enterSearchitem("samsung galaxy m53");
		search.clickSearchBtn();
		search.clickItem();
		
		//add to cart page class
		AddToCartPage cart = new AddToCartPage(driver);
		cart.switchWindow(driver);
		System.out.println(cart.getProductname());
		System.out.println(cart.getProductprice());
		cart.clickaddtocartBtn();
		
		//buy item page class
		BuyItemPage buy = new BuyItemPage(driver);
		buy.clickCheckoutbtn();
		buy.clickDeliverbtn();
		buy.clickRadiobtn();
		buy.clickaddCard();
		Thread.sleep(10000);
		buy.switchframe(driver);
		buy.inputCardno("1234234587659876");
		buy.clickAddcardbtn();
	}

}
