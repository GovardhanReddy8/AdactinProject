package regression_testing;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import pages.SearchHotelPage;

public class LoginPageTest extends BasePage{
@Test
	public void doLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.username("Govardhan");
		loginPage.password("Kgreddy88");
		loginPage.login();
		
	
		
	}
}
