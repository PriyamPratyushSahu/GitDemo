package com.selenium.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Elements needs to drag -from
		WebElement dragbank = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		System.out.println("Drag Bank successful");
		WebElement drag5000 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		System.out.println("Drag 5000 successful");
		WebElement dragsales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		System.out.println("Drag Sales successful");
		
		//Elements needs to drop -to
		WebElement dropdebitaccount = driver.findElement(By.xpath("//*[@id='bank']/li"));
		WebElement dropdebitamount = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement dropcreditaccount = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement dropcreditamount = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		js.executeScript("window.scrollBy(0,350)", "");
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragbank, dropdebitaccount).build().perform();
		System.out.println("Drop Bank to debit account successful");
		Thread.sleep(2000);
		act.dragAndDrop(drag5000, dropdebitamount).build().perform();
		System.out.println("Drop 5000 to debit amount successful");
		Thread.sleep(2000);
		act.dragAndDrop(dragsales, dropcreditaccount).build().perform();
		System.out.println("Drop sales to credit account successful");
		Thread.sleep(2000);
		act.dragAndDrop(drag5000, dropcreditamount).build().perform();
		System.out.println("Drop 5000 to debit amount successful");
		Thread.sleep(2000);
		
		driver.close();
	}

}
