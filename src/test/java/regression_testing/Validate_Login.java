package regression_testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class Validate_Login extends BasePage {

	@Test
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.username("Govardhan");
		lp.password("Kgreddy88");
		lp.login();

		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");

	}

}
