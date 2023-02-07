package com.selenium.part4;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POFTest {
	
	static POFUtilities pofutilities;
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		pofutilities = new POFUtilities(driver);
		
		pofutilities.loginOpertaion("admin","admin123");
		pofutilities.logoutOperation();
		
		driver.close();
		System.out.println("Driver closed successfully");
		
		
			
			
	}

}
