package regression_testing;

import java.io.IOException;

import utils.UtilKit;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		Object[][] obj = UtilKit.getData("com.adactin.hotelapp", "TC - 102");
		System.out.println(obj.length);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				System.out.println(obj[i][j]);
				
			}
			System.out.println();
			
		}
		
	}

}
