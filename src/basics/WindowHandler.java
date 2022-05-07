package basics;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//li[@class=' Companies']//a//div")).click();
		driver.findElement(By.xpath("//li[@class='mActive Jobs']//a//div")).click();
		String job = driver.getWindowHandle();
		
		String titleChild = " Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com ";
		driver.findElement(By.xpath("//li[@class=\" Services\"]//a//div")).click();
		
		
		Set<String> winHandlers = driver.getWindowHandles();


		List<String> winHandleList = new ArrayList<String>(winHandlers);
		
		if(swithtoWindow(winHandleList,titleChild )) {
			System.out.println(driver.getCurrentUrl() + driver.getTitle());
		}
		SwithToparent(parent);
		
		trimAllWindows(winHandleList, parent);
		
	}

	public static boolean swithtoWindow(List<String> winHandleList, String title) {
		for(String e : winHandleList) {
			String childtitle = driver.switchTo().window(e).getTitle();
			if(childtitle.contains(title)) {
				System.out.println("Page Found");
				System.out.println(driver.getTitle());
				return true;
			}
		
		}
		
		return false;
		
	}
	public static void SwithToparent(String parentID) {
		driver.switchTo().window(parentID);
		
		
	}
	public static void trimAllWindows(List<String> winHandleList, String parentid) {
		for(String e: winHandleList) {
		if(!e.contains(parentid)) {
			driver.close();
		}
	}
	}
}
