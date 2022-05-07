package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitconcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait tells to driver to wait for some period of time  to excute script
		//it will apply to overall in the class
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		WebElement user = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//explicit wait is used to tells to the driver wait for specific period for time 
		//to meet expected conditions before throwing no such element exception
		
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOf(user));
		
		//Thread.sleep(3000);
		js.executeScript("arguments[0].value='xyz@gmail'", user);
		
	}

}
