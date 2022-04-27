package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BookedItineraryPage {
	@FindBy(xpath="//input[@name='order_no']")
	WebElement orderNumber;
	public void orderNumber(String number) {
		orderNumber.getText();
		
	}

	@FindBy(xpath="//input[@name='search_hotel']")
	WebElement searchhotel;
	public void searchhotel() {
		searchhotel.click();
		
	}
	@FindBy(xpath="//input[@name='my_itinerary']")
	WebElement myitinerary;
	public void myitinerary() {
		myitinerary.click();
		
	}
	@FindBy(xpath="//input[@name='logout']")
	WebElement logout;
	public void logout() {
		logout.click();
		
	}
}
