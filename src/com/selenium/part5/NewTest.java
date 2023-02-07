package com.selenium.part5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	@BeforeSuite
	  public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");
	  }
	
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This will execute before the Test ");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This will execute before the Class");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This will execute before every Method");
	  }
	  
	  
  @Test
  public void testCase1() {
	  System.out.println("Test Case 1");
  }
  
  @Test
  public void testCase2() {
	  System.out.println("Test Case 2");
  }
  
  @Test
  public void t() {
	  System.out.println("Test Case 3");
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every Method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }


  @AfterClass
  public void afterClass() {
	  System.out.println("This will execute after every Method");
  }



  @AfterTest
  public void afterTest() {
	  System.out.println("This will execute after the test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This will execute after the test suite");
  }

}
