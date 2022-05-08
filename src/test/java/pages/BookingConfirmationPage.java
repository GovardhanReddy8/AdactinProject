package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage {
	public BookingConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='hotel_name']")
	WebElement hotelName;

	public void hotelName() {
		String hotel = hotelName.getText();
		System.out.println(hotel);
	}

	@FindBy(xpath = "//input[@name='location']")
	WebElement location;

	public void location() {
		String loc = location.getText();
		System.out.println(loc);

	}

	@FindBy(xpath = "//input[@name='room_type']")
	WebElement roomType;

	public void roomType() {
		String room = roomType.getText();
		System.out.println(room);

	}

	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement arrivalDate;

	public void arrivalDate() {
		String arrdate = arrivalDate.getText();
		System.out.println(arrdate);

	}

	@FindBy(xpath = "//input[@name='departure_date']")
	WebElement departureDate;

	public void departureDate() {
		String depdate = departureDate.getText();
		System.out.println(depdate);

	}

	@FindBy(xpath = "//input[@name='total_rooms']")
	WebElement totalRooms;

	public void titalRooms() {
		String totroom = totalRooms.getText();
		System.out.println(totroom);

	}

	@FindBy(xpath = "//input[@name='adults_room']")
	WebElement adultsRoom;

	public void adultsRoom() {
		String adulroom = adultsRoom.getText();
		System.out.println(adulroom);

	}

	@FindBy(xpath = "//input[@name='children_room']")
	WebElement childrenRoom;

	public void childrenRoom() {
		String chilroom = childrenRoom.getText();
		System.out.println(chilroom);

	}

	@FindBy(xpath = "//input[@name='price_night']")
	WebElement priceNight;

	public void priceNight() {
		String pricePerNight = priceNight.getText();
		System.out.println(pricePerNight);

	}

	@FindBy(xpath = "//input[@name='total_price']")
	WebElement totalPrice;

	public void totalPrice() {
		String totprice = totalPrice.getText();
		System.out.println(totprice);

	}

	@FindBy(xpath = "//input[@name='gst']")
	WebElement gst;

	public void gst() {
		String gt = gst.getText();
		System.out.println(gt);
	}

	@FindBy(xpath = "//input[@name='final_price']")
	WebElement finalBill;

	public void finalBill() {
		String finalprice = finalBill.getText();
		System.out.println(finalprice);

	}

	@FindBy(xpath = "//input[@name='order_no']")
	WebElement orderNo;

	public void orderNo() {
		String ordernum = orderNo.getText();
		System.out.println(ordernum);

	}

	@FindBy(xpath = "//input[@id='my_itinerary']")
	WebElement myItButton;

	public void myItButton() {
		myItButton.click();

	}

	@FindBy(xpath = "//input[@id='logout']")
	WebElement logOut;

	public void logOut() {
		logOut.click();

	}
}
