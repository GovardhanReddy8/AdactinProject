package regression_testing;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import utils.UtilKit;

public class AdactLoginPage extends BasePage{
	
	@Test(dataProvider="getTestData")
	
	public void sampleLogin(String username,String password) {
		LoginPage lp = new LoginPage(driver);
		lp.doLogin(username, password);
		
		
	}
	@DataProvider
	public Object[][] getTestData() throws IOException{
		
		return UtilKit.getData("com.adactin.hotelapp", "TC - 102");
	}

}
