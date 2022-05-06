package regression_testing;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.BookHotelPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
import utils.UtilKit;

public class SearchPageTest extends BasePage {
	@Test(dataProvider = "getTestData")
	public void searchHotel(String username, String password, String locatio, String hotel, String roomType,
			String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childernPerRoom) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(username, password);

		SearchHotelPage searchHotelPage = new SearchHotelPage(driver);
		searchHotelPage.location(locatio);
		searchHotelPage.hotels(hotel);
		searchHotelPage.roomType(roomType);
		searchHotelPage.numberofRooms(noOfRooms);
		searchHotelPage.checkInDate(checkInDate);
		searchHotelPage.checkOutDate(checkOutDate);
		searchHotelPage.adultsperRoom(adultsPerRoom);
		searchHotelPage.childrenperRoom(childernPerRoom);
		searchHotelPage.search();

		SelectHotelPage selectHotelPage = new SelectHotelPage(driver);
		selectHotelPage.hotelName();
		System.out.println(selectHotelPage.location());
		selectHotelPage.rooms();
		selectHotelPage.arrivalDate();
		selectHotelPage.departureDate();
		selectHotelPage.noofDays();
		selectHotelPage.roomsType();
		selectHotelPage.priceperNight();
		selectHotelPage.totalPrice();
		

		selectHotelPage.radio();
		selectHotelPage.button();
			

	}

	@DataProvider
	public Object[][] getTestData() throws IOException {
		return UtilKit.getData("com.adactin.hotelapp", "TC - 102");
	}

}
