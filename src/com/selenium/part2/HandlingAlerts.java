package com.selenium.part2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		//Switching to alert
		Alert alert = driver.switchTo().alert();
		
		//Capturing alert message
		String alertMessage = driver.switchTo().alert().getText();
		
		System.out.println("Alert message: " + alertMessage);
		Thread.sleep(3000);
		
		//Accepting alert
		alert.accept();
		
		//Rejecting alert
		//alert.dismiss();
		
		Thread.sleep(2000);
		driver.close();
	}
}

	
