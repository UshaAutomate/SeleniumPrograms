package testNGCrossbrowser;

import org.testng.annotations.Test;

public class TestGroup1 {
	
	@Test(groups= "smokeTest")
	public void testCaseOne() {
		System.out.println("Test One Passed");
	}

	@Test(groups= "smokeTest")
	public void testCaseTwo() {
		System.out.println("Test Two Passed");
	}
	@Test(groups= "functionalTest")
	public void testCaseThree() {
		System.out.println("Test Three Passed");
	}
	@Test(groups= "smokeTest")
	public void testCaseFour() {
		System.out.println("Test Four Passed");
	}
	@Test(groups= "functionalTest")
	public void testCaseFive() {
		System.out.println("Test Fiv Passed");
	}
	@Test(groups= "smokeTest")
	public void testCaseSix() {
		System.out.println("Test Six Passed");
	}
	@Test(groups= "functionalTest")
	public void testCaseSeven() {
		System.out.println("Test Seven Passed");
	}
}
