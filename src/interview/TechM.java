package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TechM {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
	
		WebElement dropDown = driver.findElement(By.xpath("//span[@class=\"a-dropdown-prompt\"])"));
		Select s = new Select(dropDown);
		
		s.selectByValue("US");
		
		
		

		
		
	}

}
