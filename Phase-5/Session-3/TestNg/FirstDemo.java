package com.simplileaern.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstDemo {
	
	@Test
	public void Hello() {
		System.out.println("---------------TEST-1------------------");
	}
	
	@Test
	public void Hello1() {
		System.out.println("---------------TEST-2------------------");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
  
}
