package basics;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDatacheckwithExcel {

	static WebDriver driver;
	static File  livingFile;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static XSSFCell cell;
	
	public static void main(String[] args) throws Exception {
	/*	System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.webmd.com");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement livingEle = 	driver.findElement(By.xpath("//a[contains(.,'Living  Healthy')]"));
		action.moveToElement(livingEle).build().perform();

		List<WebElement> livingListEle = driver.findElements(By.xpath("//*[@id=\"ContentPane1\"]/nav/div[1]/div[2]/ul[2]/li[3]/div/div/div[1]//ul/li//a"));
		*/
		livingFile = new File("C:\\Users\\Lucky\\Documents\\LivinghealthyList.xlsx");
		fis = new FileInputStream(livingFile);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0);
		
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum()+1;
		System.out.println(rowCount);
		
	//System.out.println(sh.getRow(0).getCell(0));
		
		for(int i=1; i< rowCount; i++) {
			System.out.println(sh.getRow(i).getCell(0));
		}
		
		System.out.println("************");
		
		//getData(0);
		System.out.println(getData(0));
	/*	for(WebElement s : livingListEle) {
			
			String list = s.getText();
			System.out.println(list);
			
			
		}*/
		
		
		
	}
		
	
public static XSSFCell getData(int sheet) {
		
		int Count = sh.getLastRowNum() - sh.getFirstRowNum()+1;
		for(int i=1; i< Count; i++) {
			cell = sh.getRow(i).getCell(0);
			return cell; 
			
		}
		//return null;
		return cell;
	}
	
	}