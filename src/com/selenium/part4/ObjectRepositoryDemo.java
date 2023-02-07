//Enter details and login into Orange HRM and log out

package com.selenium.part4;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ObjectRepositoryDemo {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	Properties obj = new Properties();
	FileInputStream objfile = new FileInputStream("Resources\\Properties\\ObjectRepositiry.properties");
	obj.load(objfile);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
			//User-name
			System.out.println("Username text: " + driver.findElement(By.cssSelector(obj.getProperty("UsernameText"))).getText());
			driver.findElement(By.cssSelector(obj.getProperty("Username"))).sendKeys("Admin");
			System.out.println("Username entered successfully");
			//Password
			driver.findElement(By.cssSelector(obj.getProperty("Password"))).sendKeys("admin123");
			System.out.println("Password entered successfully");
			//Login Button
			driver.findElement(By.cssSelector(obj.getProperty("Loginbutton"))).click();
			System.out.println("Login button clicked successfully");
			driver.navigate().refresh();
			Thread.sleep(3000);
			//Drop down menu for logout
			driver.findElement(By.cssSelector(obj.getProperty("Dropdown"))).click();
			System.out.println("Drop down clicked successfully");
			Thread.sleep(3000);
			//Logout
			driver.findElement(By.cssSelector(obj.getProperty("Logout"))).click();
			System.out.println("Logout option clicked successfully");

		Thread.sleep(3000);
		driver.close();
		System.out.println("Driver closed successfully");
		
	}


}
