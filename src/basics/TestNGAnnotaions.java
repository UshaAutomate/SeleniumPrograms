package basics;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGAnnotaions {


	/*
	
	
	@BeforeSuite()
	public void browsersetup() {
		System.out.println("Browser Setup");
	}
	@BeforeClass
	public void browserlaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeTest
	public void openApplication() {
		System.out.println("Open Application");
	}
	@BeforeClass
	public void login() {
		System.out.println("Login page");
	}
	@Test
	public void checkTitle() {
		System.out.println("Check Titile");
	}
	@Test
	public void checLink() {
		System.out.println("Check link");
	}
	@Test
	public void validateButton() {
		System.out.println("Validaate button");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout of application");
	}
	@AfterTest
	public void trimBrowser() {
		System.out.println("Close Browser");
	}*/
	
	SoftAssert asert = new SoftAssert();
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite excuted");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class excuted");
	}	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test excuted");
	}	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method excuted");
	}	@Test
	public void test1() {
		System.out.println("Test1 Method excuted");
		asert.assertEquals(true, false);
		asert.assertAll();
	}	@Test
	public void test2() {
		System.out.println("Test2 Method excuted");
	}	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method excuted");
	}	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class excuted");
	}
	@AfterClass
	public void afterTest() {
		System.out.println("After Test excuted");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite excuted");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}