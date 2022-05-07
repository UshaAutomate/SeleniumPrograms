package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExample {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		System.out.print(driver.getTitle());
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
	
	
	element(By.id("email")).sendKeys("usha");
	element(By.id("pass")).sendKeys("564");
	
	WebElement clickLogin = driver.findElement(By.xpath("//button[text()='Log In']"));
	
	driver.navigate().refresh();
	
	element(By.id("email")).sendKeys("tom");
	element(By.id("pass")).sendKeys("123");
	
	driver.navigate().refresh();

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='xyz@gmail'", user);
	
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].value='Jerry'", user);

	//	js.executeScript("arguments[0].click" , clickLogin);


		
	
		//driver.close();
	}

	public static WebElement element(By location) {
		return driver.findElement(location);
	}
}
