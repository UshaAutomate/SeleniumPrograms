package basics;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinksCheck {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {

		System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		List<WebElement> linkLists = driver.findElements(By.tagName("a"));
		linkLists.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i=0; i< linkLists.size(); i++) {
			
			if(linkLists.get(i).getAttribute("href") != null) {
				
				activeLinks.add(linkLists.get(i));
			}
		}
		System.out.println("Size of the Active LInks " + activeLinks.size());
		
		for(int j=0; j< activeLinks.size(); j++) {
			
			HttpsURLConnection connection = (HttpsURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			
			System.out.println(activeLinks.get(j).getAttribute("href") +  " + ----->" + response);
			
		}
		
		driver.close();

	}

}
