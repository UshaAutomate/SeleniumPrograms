package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlretProgram {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();		
		// Alerts are used to handle pop ups or alerts but not desktop pop ups
		
		try {
			driver.findElement(By.xpath("//li[@class='mActive Jobs']//a//div")).click();
			Thread.sleep(20000);
			Alert alert = driver.switchTo().alert();
			//alert.accept(); //click on OK  or accept the alert
			System.out.println(alert.getText()); //method is used to return the text from the alert
			driver.findElement(By.id("block")).click();
			alert.dismiss(); // click on close or dissmiss the alert
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	
		driver.close();
	}

}
