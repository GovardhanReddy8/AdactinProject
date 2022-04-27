package regression_testing;

import pages.SearchHotelPage;

public class SelectPageTesting extends Validate_Login {
	public void searchTyppe() {
		SearchHotelPage shp = new SearchHotelPage(driver);
		shp.Location();
		shp.Hotels();
		shp.RoomType();
		shp.NumberofRooms();
		shp.CheckInDate();
		shp.CheckOutDate();
		shp.AdultsperRoom();
		shp.ChildrenperRoom();
		shp.Search();

	}

}
