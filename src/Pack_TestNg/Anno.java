package Pack_TestNg;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;

public class Anno {
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Execute before every test");
	}
	
	@BeforeGroups
    public void BeforeClass() {
        // TODO Auto-generated method stub
        System.out.println("Execute before every class");

    }
    
    @org.testng.annotations.BeforeMethod
    public void BeforeMethod() {
        // TODO Auto-generated method stub
        System.out.println("Execute before every Method");

    }
    
    @org.testng.annotations.AfterMethod
    public void AfterMethod() {
        // TODO Auto-generated method stub
        System.out.println("Execute after every Method");

    }
    
    
    @org.testng.annotations.AfterClass
    public void AfterClass() {
        // TODO Auto-generated method stub
        System.out.println("Execute after every class");
    }

}
