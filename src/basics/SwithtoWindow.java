package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithtoWindow {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		String parentWindowID = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[contains(@alt,'LinkedIn OrangeHRM group')]")).click();
		
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on Facebook')]")).click();

		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on twitter')]")).click();
		
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on youtube')]")).click();
		
		Set<String> HandleList = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(HandleList);
		
		if(switchToWindow("Facebook", hList)) {
			
			System.out.println(driver.getCurrentUrl() + "  " + driver.getTitle());
			
		}
		
	
		swithToParenWindow(parentWindowID);
		closeAllwindows(hList, parentWindowID);


	}
	
	public static boolean switchToWindow(String title, List<String> hList) {
		
		for(String e: hList) {
			String windowTilte = driver.switchTo().window(e).getTitle();
			if(windowTilte.contains(title)) {
				System.out.println("Found The right window");
				return true;
				
			}
		}
		return false;
		
	}

	public static void swithToParenWindow(String parentWindowID) {
		
		driver.switchTo().window(parentWindowID);
		
		
	}
	public static void closeAllwindows(List<String> hList, String parentWindowID) {
		for(String e : hList) {
			
			if(!e.equals(parentWindowID)) {
				driver.switchTo().window(e).close();
				
			}
			
		}
		
	}
}
