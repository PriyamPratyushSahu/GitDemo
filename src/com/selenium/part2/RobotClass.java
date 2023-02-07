package com.selenium.part2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	
		
		public static void main(String args[]) throws InterruptedException, AWTException
		{
		System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//User-name
			System.out.println("Username text: " + driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(2)")).getText());
			driver.findElement(By.cssSelector("input[placeholder='Username']")).click();
			Thread.sleep(2000);
			
			Robot robot = new Robot();

			//Input: Admin@
			robot.keyPress(KeyEvent.VK_SHIFT);	//shift on
			robot.keyPress (KeyEvent.VK_A);		//A
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_SHIFT);//shift off
			Thread.sleep(1000);
			robot.keyPress (KeyEvent.VK_D);		//d
			Thread.sleep(1000);
			robot.keyPress (KeyEvent.VK_M);		//m
			Thread.sleep(1000);
			robot.keyPress (KeyEvent.VK_I);		//i
			Thread.sleep(1000);
			robot.keyPress (KeyEvent.VK_N);		//n
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_SHIFT);	//shift on
			robot.keyPress (KeyEvent.VK_2);		//@
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_SHIFT);//shift off
			Thread.sleep(1000);
			robot.keyRelease (KeyEvent.VK_A);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_D);
			Thread.sleep(1000);
			robot.keyRelease (KeyEvent.VK_M);
			Thread.sleep(1000);
			robot.keyRelease (KeyEvent.VK_I);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_N);
			Thread.sleep(3000);


			
			
			driver.close();
		}

}
