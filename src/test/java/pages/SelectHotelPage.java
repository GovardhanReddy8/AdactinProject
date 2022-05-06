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

	public void hotelName() {  // one way 
		 hotelName.getText();
		 System.out.println(hotelName);

	}

	@FindBy(xpath = "//input[@name='location_0']")
	WebElement location;

	
	  public String location() { 
		  
		  return location.getText(); // other way
	  
	  }
	 

	@FindBy(xpath = "//input[@name='rooms_0']")
	WebElement rooms;

	public String rooms() {
		return rooms.getText();

	}

	@FindBy(xpath = "//input[@name='arr_date_0']")
	WebElement arrivalDate;

	public String arrivalDate() {
		return arrivalDate.getText();

	}

	@FindBy(xpath = "//input[@name='dep_date_0']")
	WebElement departureDate;

	public String departureDate() {
		return departureDate.getText();

	}

	@FindBy(xpath = "//input[@name='no_days_0']")
	WebElement noofDays;

	public String noofDays() {
		return noofDays.getText();
	}

	@FindBy(xpath = "//input[@name='room_type_0']")
	WebElement roomsType;

	public String roomsType() {
		return roomsType.getText();
	}

	@FindBy(xpath = "//input[@name='price_night_0']")
	WebElement priceperNight;

	public String priceperNight() {
		return priceperNight.getText();
	}

	@FindBy(xpath = "//input[@name='total_price_0']")
	WebElement totalPrice;

	public String totalPrice() {
		return totalPrice.getText();
	}
}