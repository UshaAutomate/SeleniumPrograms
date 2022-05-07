package testNGCrossbrowser;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestGroup2 {
	SoftAssert asert;
	
	@Test( invocationCount = 3, groups = "smokeTest")
	public void testCaseOne() {
		System.out.println("Test One 2 Passed");
	}

	@Test(groups= "smokeTest", enabled =false )
	public void testCaseTwo() {
		System.out.println("Test Two 2 Passed");
	}
	@Test(invocationCount = 3, groups= "smokeTest")
	public void testCaseThree() {
		System.out.println("Test Three 2 Passed");
	}
	@Test(groups= "smokeTest")
	public void testCaseFour() {
		System.out.println("Test Four 2 Passed");
	}
	@Test(groups= "functionalTest")
	public void testCaseFive() {
		System.out.println("Test Fiv 2 Passed");

	}
	@Test(groups= "smokeTest", dependsOnMethods= "testCaseFive")
	public void testCaseSix() {
		System.out.println("Test Six 2 Passed");
		
	}
	@Test(groups= "functionalTest")
	public void testCaseSeven() {
		System.out.println("Test Seven 2 Passed");
	}


}
