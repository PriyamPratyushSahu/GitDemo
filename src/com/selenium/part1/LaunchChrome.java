package com.selenium.part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Navigate successful");
		driver.manage().window().maximize();
		String givenTitle = "OrangeHRM";
		String expectedTitle = driver.getTitle();
		System.out.println("Website Title: " + expectedTitle);
		System.out.println("Title Matched: " + givenTitle.equals(expectedTitle));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		System.out.println("Driver closed successfully");
	}

}
