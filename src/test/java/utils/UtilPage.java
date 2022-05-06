package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pages.BasePage;

public class UtilPage extends BasePage {
	public void exceldata() throws IOException {

		FileInputStream fil = new FileInputStream("src\\test\\testdata\\TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fil);
		Sheet sheet = wb.getSheet("com.adactin.hotelapp");
		ArrayList<Row> rows = new ArrayList<Row>();
		System.out.println(rows.size());
		System.out.println(rows.get(1).getLastCellNum());
		for (int i = 0; i < rows.size(); i++) {
			for (int j = 0; j < rows.get(0).getLastCellNum(); j++) {
				rows.get(i + 1).getCell(j + 1).toString();
			//	System.out.println(sheet.getPhysicalNumberOfRows());
			//	System.out.println(sheet.getLastRowNum());

			}
		//	System.out.println();

		}

	}

}
