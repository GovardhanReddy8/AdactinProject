package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pages.BasePage;

public class UtilPage extends BasePage {
	public static Object[][] getData(String appname, String testcase) throws IOException {
		FileInputStream file = new FileInputStream("src\\test\\testdata\\TestData1.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(appname);
		ArrayList<Row> testrows = new ArrayList<Row>();
		testrows = findrows(sheet, testcase);
		Object[][] obj = new Object[testrows.size() - 1][testrows.get(0).getLastCellNum() - 1];
		for (int i = 0; i < testrows.size() - 1; i++) {
			for (int j = 0; j < testrows.get(0).getLastCellNum() - 1; j++) {
				obj[i][j]=testrows.get(i+1).getCell(j+1).toString();
				
			}
			
		}

		return obj;

	}

	private static ArrayList<Row> findrows(Sheet sheet, String testcase) {
		ArrayList<Row> rows = new ArrayList<Row>();
		ArrayList<Row> testrows = new ArrayList<Row>();
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			if (!(sheet.getRow(i)==null)) {
				rows.add(sheet.getRow(i));
			}
			
		}
		for (int i = 0; i < rows.size(); i++) {
			if (rows.get(i).getCell(0).getStringCellValue().equals(testcase)) {
				testrows.add(rows.get(i));
				
			}
			
		}

		return testrows;
	}

}
