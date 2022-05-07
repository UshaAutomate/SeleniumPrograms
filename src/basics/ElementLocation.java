package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocation {

static WebDriver driver;
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement logo = driver.findElement(By.id("nav-logo"));
		
		// one approach to find location of an element
		System.out.println(logo.getLocation());
		System.out.println(logo.getLocation().getX());
		System.out.println(logo.getLocation().getY());
		
		//two approach
		
		System.out.println(logo.getRect().getX());
		System.out.println(logo.getRect().getY());
		
		
		// find size of  the img / element
		
		System.out.println(logo.getSize());
		System.out.println(logo.getSize().getHeight());
		System.out.println(logo.getSize().getWidth());
		
		System.out.println(logo.getRect().getHeight());
		driver.quit();
		

	}

}
