package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public SelectHotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	WebElement radio;
	@FindBy(xpath = "//input[@name='continue']")
	WebElement button;

	public void radio() {
		radio.click();
	}

	public void button() {
		button.click();

	}

	@FindBy(xpath = "//input[@name='hotel_name_0']")
	WebElement hName;

	public void hotelName() {
		hName.getText();

	}

	@FindBy(xpath = "//input[@name='location_0']")
	WebElement location;

	public void loc() {
		location.getText();

	}

	@FindBy(xpath = "//input[@name='rooms_0']")
	WebElement rooms;

	public void room() {
		rooms.getText();

	}

	@FindBy(xpath = "//input[@name='arr_date_0']")
	WebElement arrdate;

	public void ard() {
		arrdate.getText();

	}

	@FindBy(xpath = "//input[@name='dep_date_0']")
	WebElement depdate;

	public void depd() {
		depdate.getText();
	}

	@FindBy(xpath = "//input[@name='no_days_0']")
	WebElement noday;

	public void nday() {
		noday.getText();
	}

	@FindBy(xpath = "//input[@name='room_type_0']")
	WebElement rtype;

	public void type() {
		rtype.getText();
	}

	@FindBy(xpath = "//input[@name='price_night_0']")
	WebElement pricen;

	public void price() {
		pricen.getText();
	}

	@FindBy(xpath = "//input[@name='total_price_0']")
	WebElement tprice;

	public void pricet() {
		tprice.getText();
	}
}