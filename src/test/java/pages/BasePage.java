package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {

	public static WebDriver driver; // use for assert method in validation

	@BeforeMethod
	public void setUp() throws IOException {
		FileInputStream fil = new FileInputStream("Properties\\config.properties");
		Properties prs = new Properties();
		prs.load(fil);
		prs.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(prs.getProperty("url"));

		driver.manage().timeouts().implicitlyWait(Long.parseLong(prs.getProperty("implicitWait")), TimeUnit.SECONDS);

	}

	@AfterMethod

	public void teardown() {
		driver.quit();
	}

}
