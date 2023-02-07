package com.selenium.part5;

import org.testng.annotations.Test;

	public class TestNGGrouping {
		@Test (groups = { "Smoke" })
		public void smokel(){
			System.out.println("Smoke Test Case l.");
		}
		
		@Test (groups = { "Smoke" })
		public void smoke2(){
			System.out.println("Smoke Test Case 2.");
		}
		
		@Test (groups = { "Regression" })
		public void regressionl (){
			System.out.println("Regression Test case l.");
		}
		@Test (groups = { "Regression" })
		public void regression2(){
			System.out.println("Regression Test Case 2.");
		}
		@Test (groups = { "Smoke", "Regression" })
		public void smokeAndRegression(){
			System.out.println("Smoke and Regression Test Case.");
		}
	}
