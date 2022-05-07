package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsingXpath {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		try {
			
		
		driver.findElement(By.xpath("//li[@id=\"p_89/OnePlus\"]//i[@class=\"a-icon a-icon-checkbox\"]")).click();
		//xpath by using parent child method
		
		//span[text()='OnePlus']//parent::a[@class="a-link-normal s-navigation-item"]//preceding-sibling::i[@class="a-icon a-icon-checkbox"]
		//span[text()="OnePlus"]//parent::div[@class="a-section"]//preceding-sibling::a[@id="p_89/OnePlus"]
		////span[@class='a-size-small a-color-base'][contains(.,'OnePlus')]
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<WebElement> listMob = driver.findElements(By.xpath("//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]"));
		
		for(int i=0; i<listMob.size(); i++) {
			System.out.println(listMob.get(i).getText());
		}
		
		List<WebElement> listPrice =  driver.findElements(By.xpath("//a[@class=\"a-size-base a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]"));
		for(int i=0; i<listPrice.size(); i++) {
			String s = listPrice.get(i).getText();
			
			System.out.println(listPrice.get(i).getText());
		}
		
		//for(String s :listMob )
		driver.close();
		
		
		
	}

}
