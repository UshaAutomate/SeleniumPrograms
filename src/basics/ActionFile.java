package basics;

import java.util.concurrent.TimeUnit;

public class ActionFile extends UtitlityFile{

	public static void browserLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		if(exp_Title.contentEquals(driver.getTitle())) {
			System.out.println("Application Launched Successfully");
		} else {
			System.out.println("Application Launched Unsuccessfully");
		}
		
	}
	
	public static void browserTrim() {
		driver.close();
	}
	
}
