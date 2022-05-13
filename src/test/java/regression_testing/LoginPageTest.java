package regression_testing;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import utils.UtilPage;


public class LoginPageTest extends BasePage {
	@Test(dataProvider = "getGov")
	public void doLogin(String username, String password) throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(username, password);
		
	}
	@DataProvider
	Object[][] getGov() throws Exception{
		return UtilPage.getData("com.adactin.hotelapp", "Login");
	}
}


