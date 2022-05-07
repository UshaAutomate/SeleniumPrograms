package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.common.reflection.qual.GetMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptExecutorexample {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.id("nav-logo"));

		//JavascriptExecutor.drawBorder(logo,driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].style.border= '3px solid red'", logo);
		
			
		//TakesScreenshot ts = (TakesScreenshot) driver;
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//logoama1.png");
		FileUtils.copyFile(src, dest);
		
		
		    
	
		//driver.quit();
	
	
	}

	public static void eleBorderJs(WebElement ele, String fileName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border= '3px solid red'", ele);
	}
	public static void takeScnshotEle(WebElement ele)   {
		//TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\fileName.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
