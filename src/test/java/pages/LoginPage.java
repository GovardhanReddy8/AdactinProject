package pages;

public class LoginPage {
  WebDriver driver;
	
	public void homePage() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	public void doLogin(String path, String value) {
		driver.findElement(By.xpath(path)).sendKeys(value);
		driver.findElement(By.xpath(path)).click();
	}

}
