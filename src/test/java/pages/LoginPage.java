package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) { // need to ask
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	WebElement login;

	public void username(String untext) {
		username.sendKeys(untext);
	}

	public void password(String pstext) {
		password.sendKeys(pstext);

	}

	public void login() {
		login.click();

	}

	public void doLogin(String untext, String pstext) {
		username.sendKeys(untext);
		password.sendKeys(pstext);
		login.click();

	}

}
