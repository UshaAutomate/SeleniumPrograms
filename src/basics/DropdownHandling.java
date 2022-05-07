package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(20);

		driver.findElement(By.xpath("//*[contains(@id,'u_9_9_')]")).click();
		WebElement day =driver.findElement(By.xpath("//*[@id=\"day\"]"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//selectDropdown(day, "10");
		//selectDropdown(month, "May");
	//	selectDropdown(year, "1990");
		
		
		Select s = new Select(day);
		//List<WebElement> monthl = s.getOptions();
		
		s.selectByIndex(3);
		
		boolean ddvisible = day.isSelected();
		System.out.println("Dates : " + ddvisible);

		
		s.selectByVisibleText("20");
		
	
		driver.close();
	}

	public static void selectDropdown(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
		
		
	}
}

