package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHotelPage {
	WebDriver driver;

	public void selectHotel(String select, String enter) {
		driver.findElement(By.xpath(select)).sendKeys(enter);
		driver.findElement(By.xpath(select)).click();

	}

}
