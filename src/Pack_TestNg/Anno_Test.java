package Pack_TestNg;

import org.testng.annotations.Test;

public class Anno_Test extends Anno{
	
	@Test(priority=1)
    public void VerifyLogin() {
        // TODO Auto-generated method stub
        System.out.println("LOGGED in");

    }
    @Test(priority=0)
    public void VerifyLogout() {
        // TODO Auto-generated method stub
        System.out.println("LOGGED out");

    }

}
