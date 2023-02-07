package com.selenium.part3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingiFrames {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herouapp.com/iframe");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("mce_0_ifr");
		Thread.sleep(2000);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Example of handling iFrame");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}

