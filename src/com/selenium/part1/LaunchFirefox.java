package com.selenium.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchFirefox {


	public static void main(String args[]) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","Resources\\Drivers\\MozillaDriver\\geckodriver.exe");
		
//		DesiredCapabilities capabilites = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette",true);  
//        WebDriver driver= new FirefoxDriver(capabilities); 
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Navigate successful");
		String ss = driver.getTitle();
		System.out.println("Website Title: " + ss);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		System.out.println("driver closed  successfully");
	}
}
