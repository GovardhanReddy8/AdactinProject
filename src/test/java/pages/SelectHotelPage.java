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
	WebElement hotelName;

	public void hotelName() {                    // one way public String hotelName  , hotelName.getText();
		String hname = hotelName.getText();
		System.out.println(hname);

	}

	@FindBy(xpath = "//input[@name='location_0']")
	WebElement location;

	public void location() {

		String loc = location.getText();
		System.out.println(loc);

	}

	@FindBy(xpath = "//input[@name='rooms_0']")
	WebElement rooms;

	public void rooms() {
		String room = rooms.getText();
		System.out.println(room);

	}

	@FindBy(xpath = "//input[@name='arr_date_0']")
	WebElement arrivalDate;

	public void arrivalDate() {
		String ardate = arrivalDate.getText();
		System.out.println(ardate);

	}

	@FindBy(xpath = "//input[@name='dep_date_0']")
	WebElement departureDate;

	public void departureDate() {
		String dedate = departureDate.getText();
		System.out.println(dedate);

	}

	@FindBy(xpath = "//input[@name='no_days_0']")
	WebElement noofDays;

	public void noofDays() {
		String noday = noofDays.getText();
		System.out.println(noday);
	}

	@FindBy(xpath = "//input[@name='room_type_0']")
	WebElement roomsType;

	public void roomsType() {
		String rtype = roomsType.getText();
		System.out.println(rtype);
	}

	@FindBy(xpath = "//input[@name='price_night_0']")
	WebElement priceperNight;

	public void priceperNight() {
		String pnight = priceperNight.getText();
		System.out.println(pnight);
	}

	@FindBy(xpath = "//input[@name='total_price_0']")
	WebElement totalPrice;

	public void totalPrice() {
		String tprice = totalPrice.getText();
		System.out.println(tprice);
	}
}