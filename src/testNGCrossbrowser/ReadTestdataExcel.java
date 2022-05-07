package testNGCrossbrowser;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestdataExcel {
	
	
	
	public static ArrayList<Object[]> readData() throws Exception {
		
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		
		File filesrc = new File("C:\\Users\\Lucky\\Documents\\seleniumexcel.xlsx");
		FileInputStream fis = new FileInputStream(filesrc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(1);
		System.out.println(sh.getLastRowNum()-sh.getFirstRowNum());
		
		int rows = sh.getLastRowNum()-sh.getFirstRowNum();
		
		System.out.println(".........." +sh.getRow(1).getCell(1).toString());
		for(int rowCnt=1; rowCnt<= rows; rowCnt++) {
			
			XSSFCell username= sh.getRow(rowCnt).getCell(0);
			XSSFCell password= sh.getRow(rowCnt).getCell(1);
			
			System.out.println(username + "**********" + password);
			
			Object ob[]= {username, password};
			data.add(ob);
			
			
		}
		return data;
	}

}
