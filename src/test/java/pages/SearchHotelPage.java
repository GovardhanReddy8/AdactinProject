package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

	public void Location() {
		Select select = new Select(Location);
		select.selectByIndex(5);
		
	}

	public void Hotels() {
		Select one = new Select(Hotels);
		one.selectByIndex(1);
	}

	public void RoomType() {
		Select two = new Select(RoomType);
		two.selectByIndex(1);
		
	}

	public void NumberofRooms() {
		Select three = new Select(NumberofRooms);
		three.selectByIndex(0);
	}

	public void CheckInDate() {
		Select four = new Select(CheckInDate);
		four.selectByVisibleText(null);
	}

	public void CheckOutDate() {
		Select five = new Select(CheckOutDate);
		five.selectByVisibleText(null);
	}

	public void AdultsperRoom() {
		Select six = new Select(AdultsperRoom);
		six.selectByIndex(1);
	}

	public void ChildrenperRoom() {
		Select seven = new Select(ChildrenperRoom);
		seven.selectByIndex(0);
	}

	public void Search() {
		Search.click();
	}


}
