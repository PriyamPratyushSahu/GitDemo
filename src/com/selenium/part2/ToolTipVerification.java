package com.selenium.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipVerification {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement github = driver.findElement(By.cssSelector("#top-bar > div > div > div.wf-td.right-block > div > a.github"));
		System.out.println("Github Attributes");
		System.out.println("Class: " + github.getAttribute("class"));
		System.out.println("Title: " + github.getAttribute("title"));
		System.out.println("Address: " + github.getAttribute("href"));
		Thread.sleep(2000);
		
		
		
		
		
		
//		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs.get(1));
//	    Thread.sleep(2000);
//	    driver.close();
//	    driver.switchTo().window(tabs.get(0));
//	    Thread.sleep(2000);
		driver.close();
	}

}
