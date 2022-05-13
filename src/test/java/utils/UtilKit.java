package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pages.BasePage;

public class UtilKit extends BasePage {
	public void initTest() {
	}
	public void closeTest() {
		driver.quit();
	}
	public static Object[][] getData(String appName,String testcase) throws IOException
	{
		FileInputStream file = new FileInputStream("src\\test\\testdata\\TestData1.xlsx");
	//	XSSFWorkbook wb = new XSSFWorkbook(file); // other method
		Workbook wb = WorkbookFactory.create(file);  
		Sheet sheet = wb.getSheet(appName);
		ArrayList<Row> rows = new ArrayList<Row>();
		rows=findRows(sheet,testcase);
	//	System.out.println(rows.size());
		rows.size();
	//	System.out.println(rows.get(1).getLastCellNum());
		rows.get(1).getLastCellNum();
		Object[][] obj=new Object[rows.size()-1][rows.get(0).getLastCellNum()-1];
		for (int i = 0; i < rows.size()-1; i++) {
			for (int j = 0; j < rows.get(0).getLastCellNum()-1; j++) {
				obj[i][j]= rows.get(i+1).getCell(j+1).toString();
			//	System.out.println("["+i+"]"+"["+j+"]"+"===="+obj[i][j]); 
				
			}
			// System.out.println();
		}		
		
		return obj;
	}
	private static ArrayList<Row> findRows(Sheet sheet, String testcase) {
		ArrayList<Row> list = new ArrayList<Row>();
		ArrayList<Row> rows = new ArrayList<Row>();
	//	System.out.println(sheet.getPhysicalNumberOfRows());
	//	System.out.println(sheet.getLastRowNum());
		sheet.getPhysicalNumberOfRows();
		sheet.getLastRowNum();
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			if (!(sheet.getRow(i)==null)) {
				list.add(sheet.getRow(i));
				
			}
			
		}
		System.out.println(list.size());
		for (int i = 0; i <list.size(); i++) {
			if (list.get(i).getCell(0).getStringCellValue().equals(testcase)) {
				rows.add(list.get(i));
				
			}
			
		}
		
		return rows;
	}
	
}
