package com.selenium.part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxtest {
	
	public static void main(String args[])
	{
		System.out.println("Hello World");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
