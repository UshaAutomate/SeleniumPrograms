package testNGCrossbrowser;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvederUse {

	static WebDriver driver;
	@BeforeMethod
	@Parameters("url")
	public void login( String url) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		

		
		
	}	
	
	@DataProvider
	public Iterator<Object[]> getTestData() throws Exception {
		ArrayList<Object[]> data = ReadTestdataExcel.readData();
		return data.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void login(String username, String password) {
		
		

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
	}
	
	@AfterMethod
	public void trim() {
		
		driver.close();
		
	}
}
