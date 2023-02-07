package com.selenium.part5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {
  @Test
  public void orangeHRM() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
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

			
						
			Thread.sleep(3000);
			driver.close();
			System.out.println("Driver closed successfully");
  }
}
