package regression_testing;

import org.testng.Assert;
import pages.SearchHotelPage;

public class SelectPageTesting extends Validate_Login {
	public void searchTyppe() throws Exception {
		SearchHotelPage shp = new SearchHotelPage(driver);
		shp.Location("Melbourne");
		shp.Hotels("Hotel Sunshine");
		shp.RoomType("Double");
		shp.NumberofRooms("1");
		shp.CheckInDate("26/04/2022");
		shp.CheckOutDate("27/04/2022");
		shp.AdultsperRoom("2");
		shp.ChildrenperRoom("0");
		shp.Search();
		Thread.sleep(5000);

		Assert.assertEquals("driver.getTitle", "adactinhotelapp");
	}

}
