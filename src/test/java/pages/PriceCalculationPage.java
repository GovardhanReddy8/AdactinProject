package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceCalculationPage {
	public PriceCalculationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='room_num_dis']")
	WebElement numofRooms;

	public void numofrooms() {
		numofRooms.getText();

	}

	@FindBy(xpath = "//input[@name='total_days_dis']")
	WebElement numofDay;

	public String numofday() {
		return numofDay.getText();
	}

	@FindBy(xpath = "//input[@name='price_night_dis']")
	WebElement pricePerNight;

	public String pricepernight() {
		return pricePerNight.getText();
	}

	@FindBy(xpath = "//input[@name='total_price_dis']")
	WebElement totalPrice;

	public String totalPrice() {
		return totalPrice.getText();
	}

	@FindBy(xpath = "//input[@name='gst_dis']")
	WebElement gst;

	public String gst() {
		return gst.getText();
	}

	@FindBy(xpath = "//input[@name='final_price_dis']")
	WebElement finalPrice;

	public String finalPrice() {
		return finalPrice.getText();

	}
}
