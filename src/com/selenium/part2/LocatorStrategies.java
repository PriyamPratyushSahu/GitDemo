//Enter details and login into Orange HRM and log out

package com.selenium.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategies {
	
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
		int flag = 1;
		//Flag = 1 -> Login
		//FLag = 2 -> Forgot Password
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		if(flag == 1)
		{
			//User-name
			System.out.println("Username text: " + driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(2)")).getText());
			driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
			System.out.println("Username entered successfully");
			//Password
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
			System.out.println("Password entered successfully");
			//Login Button
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			System.out.println("Login button clicked successfully");
			driver.navigate().refresh();
			Thread.sleep(3000);
			//Drop down menu for logout
			driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > img")).click();
			System.out.println("Drop down clicked successfully");
			Thread.sleep(3000);
			//Logout
			driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")).click();
			System.out.println("Logout option clicked successfully");

		}
		
		else if(flag == 2)
		{
			//Forgot Password
			driver.findElement(By.cssSelector(".oxd-text.oxd-text--p.orangehrm-login-forgot-header")).click();
			System.out.println("Forgot password clicked entered successfully");
			Thread.sleep(3000);
			//Enter user-name
			driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
			System.out.println("Username entered successfully");
			//Submit Button
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			System.out.println("Submit button clicked successfully");
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.navigate().back();
			System.out.println("Naviagated back successfully");
			//Cancel Button
			driver.findElement(By.cssSelector("button[type='button']")).click();
			System.out.println("Cancel button clicked successfully");
			

		}			
		
		Thread.sleep(3000);
		driver.close();
		System.out.println("Driver closed successfully");
		
	}
	

}
