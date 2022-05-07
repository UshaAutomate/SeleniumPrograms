package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.webmd.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement livingEle = driver.findElement(By.xpath("//a[contains(.,'Living  Healthy')]"));
		
		action.moveToElement(livingEle).build().perform();
		Thread.sleep(1000);
		
		
		List<WebElement> livingListEle = driver.findElements(By.xpath("//*[@id=\"ContentPane1\"]/nav/div[1]/div[2]/ul[2]/li[3]/div/div/div[1]//ul/li//a"));
		
		
		System.out.println(livingListEle.size());	
		
		for(WebElement objList : livingListEle)
		{
			String list = objList.getText();
			System.out.println(list);
		}

		System.out.println("******************");
		
		listElement(livingListEle);
		
		
		driver.close();
		
		
	
		
	}
	

	public static void listElement(List<WebElement> li) {
	
List<WebElement> livingListEle = li;
	
		
		for(WebElement objList : livingListEle)
		{
			String list = objList.getText();
			System.out.println(list);
		}

		
	

	
}
	
}


