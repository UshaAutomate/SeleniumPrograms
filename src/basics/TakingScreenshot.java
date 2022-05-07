package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		System.out.print(driver.getTitle());
		
		TakesScreenshot ts = ( TakesScreenshot) driver;
		File screenFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenFile, new File("./home.png"), true);
		
		
		takeScreen(driver, "newHome");
		
		driver.close();
		
		
		

	}
	
	public static void takeScreen(WebDriver driver, String filename) throws IOException {
		TakesScreenshot ts = ( TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./"+filename + ".png"));
		
	}

}
