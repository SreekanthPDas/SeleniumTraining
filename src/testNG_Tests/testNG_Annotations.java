package testNG_Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNG_Annotations {

	public testNG_Annotations() {
		
	}

	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method");
	}
	
	@Test
	public void myTest() {
		
		System.out.println("In TEST 1");
	}
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("After Class");
	}
	

	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("After Suite");
	}
	

	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("After Methood");
	}	
}

