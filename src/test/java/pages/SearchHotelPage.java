package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	public SearchHotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='location']")
	WebElement Location;
	@FindBy(xpath = "//select[@name='hotels']")
	WebElement Hotels;
	@FindBy(xpath = "//select[@name='room_type']")
	WebElement RoomType;
	@FindBy(xpath = "//select[@name='room_nos']")
	WebElement NumberofRooms;
	@FindBy(xpath = "//input[@name='datepick_in']")
	WebElement CheckInDate;
	@FindBy(xpath = "//input[@name='datepick_out']")
	WebElement CheckOutDate;
	@FindBy(xpath = "//select[@name='adult_room']")
	WebElement AdultsperRoom;
	@FindBy(xpath = "//select[@name='child_room']")
	WebElement ChildrenperRoom;
	@FindBy(xpath = "//input[@name='Submit']")
	WebElement Search;

	public void Location(String value) {
		Location.sendKeys(value);
	}

	public void Hotels(String value) {
		Hotels.sendKeys(value);
	}

	public void RoomType(String value) {
		RoomType.sendKeys(value);
	}

	public void NumberofRooms(String value) {
		NumberofRooms.sendKeys(value);
	}

	public void CheckInDate(String value) {
		CheckInDate.sendKeys(value);
	}

	public void CheckOutDate(String value) {
		CheckOutDate.sendKeys(value);
	}

	public void AdultsperRoom(String value) {
		AdultsperRoom.sendKeys(value);
	}

	public void ChildrenperRoom(String value) {
		ChildrenperRoom.sendKeys(value);
	}

	public void Search() {
		Search.click();
	}

	public void searchHotel(String value) {
		Location.sendKeys(value);
		Hotels.sendKeys(value);
		RoomType.sendKeys(value);
		NumberofRooms.sendKeys(value);
		CheckInDate.sendKeys(value);
		CheckOutDate.sendKeys(value);
		AdultsperRoom.sendKeys(value);
		ChildrenperRoom.sendKeys(value);
		Search.click();
	}

}
