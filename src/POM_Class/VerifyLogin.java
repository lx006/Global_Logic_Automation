package POM_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxmi.dawane\\eclipse-workspace\\Global_Logic_Automation\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 0, 0));
		lp.enterPassword(ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 0, 1));
		lp.clickButton();
		
		AddUserPage ad = new AddUserPage(driver);
		ad.moveAdmin(driver);
		ad.clickUserManagement();
		ad.clickUsers();
		ad.clickAddBtn();
		ad.selectUsertype(ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 0, 0));
		ad.inputEmpName(ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 1, 0));
		ad.inputUserName(ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 1, 1));
		ad.selectStatus(0);
		ad.inputPassword(ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 2, 0));
		ad.inputConfirmPswd(ExcelData.getdata("D:\\orangeExcel.xls", "sheet1", 2, 0));
		ad.clickSave();
		
	}

}
