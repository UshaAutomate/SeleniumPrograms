package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenlinkinNewTab {
	static WebDriver driver;
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		String parentId = driver.getWindowHandle();
		
		System.out.println(parentId);
		driver.manage().window().maximize();
		
		String tab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).sendKeys(tab);
		
		String childId = driver.getWindowHandle();
		System.out.println(childId);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().window(childId);
	}

}
