package testNGCrossbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

public class CrossbrowserTest {
	WebDriver driver;
	String actTitle = "Google", expTitle;
	SoftAssert asert = new SoftAssert();
	

@Test(priority = 1)
@Parameters("browser")
public void setUp(String browserName) {
	
	if(browserName.equalsIgnoreCase("chrome")) {
	
	System.setProperty("webdriver.chrome.driver", "\\Users\\Lucky\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	
	}else if(browserName.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucky\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	
	}else if(browserName.contentEquals("ie")) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Lucky\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test(priority =2)
public void openApplication() {
	driver.get("http://www.google.com");
	expTitle = driver.getTitle();
	
	if(actTitle.contentEquals(expTitle)) {
		System.out.println("Application Opened");
		asert.assertEquals(actTitle, expTitle, "Title Mismatched");
	}
	

}
@Test(priority =3)
public void txtFieldVisible() {
	
	boolean txtEnable = driver.findElement(By.name("q")).isEnabled();
	asert.assertEquals(true, txtEnable, "Text Filed must be Enabled");
	
}

@Test(priority =4)
public void btndVisible() {
	
	boolean btnEnable = driver.findElement(By.name("btnK")).isEnabled();
	asert.assertEquals(true, btnEnable, "Button Filed must be Enabled");
	asert.assertAll();
	
}

@Test(priority = 5)
public void trim() {
	driver.close();
}
}
