package testNGCrossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BrowserFirefox {

	static WebDriver driver;

	@Test
	@Parameters({ "username", "password"})
	public void login(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys(username);;
		driver.findElement(By.xpath("//span[text()=\"Next\"]"));
		
		
		
		
		
		
	}	
	
	
		
	
}
