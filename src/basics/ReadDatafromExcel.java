package basics;

import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public static void main(String[] args) throws Exception {

		File filesrc = new File("C:\\Users\\Lucky\\Documents\\seleniumexcel.xlsx");
		FileInputStream fis = new FileInputStream(filesrc);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		System.out.println(sh.getRow(0).getCell(1));
		System.out.println(sh.getRow(1).getCell(1));
		
		sh.getRow(0).createCell(2).setCellValue("pass");
		sh.getRow(1).createCell(2).setCellValue("pass");
		sh.getRow(2).createCell(2).setCellValue("pass");
		
		FileOutputStream fos = new FileOutputStream(filesrc);
		wb.write(fos);
		
		wb.close();
		

		
	}

}
