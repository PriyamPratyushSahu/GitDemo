package com.selenium.part4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMPage {
	
	WebDriver driver;
	
	By usernametext = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(2)"); 
	By username = By.cssSelector("input[placeholder='Username']");
	By password = By.cssSelector("input[placeholder='Password']");
	By login = By.cssSelector("button[type='submit']");
	By dropdown = By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > img");
	By logout = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
	
	public POMPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getUsernameText()
	{
		System.out.println("Username text: " + driver.findElement(usernametext).getText());
	}
	
	public void enterUserName(String strusername)
	{
		driver.findElement(username).sendKeys(strusername);
		System.out.println("Username entered successfully");
		
	}
	
	public void enterPassword(String strpassword )
	{
		driver.findElement(password).sendKeys(strpassword);
		System.out.println("Password entered successfully");
		
	}
	
	public void clickloginbutton()
	{
		driver.findElement(login).click();
		System.out.println("Login button clicked successfully");
	
	}
	
	public void selectdropdown()
	{
		driver.findElement(dropdown).click();
		System.out.println("Drop down clicked successfully");
		
	}
	
	public void clicklogout()
	{
		driver.findElement(logout).click();
		System.out.println("Logout option clicked successfully");
		
	}
	
	public void loginOpertaion(String strusername, String strpassword) throws InterruptedException
	{
		Thread.sleep(3000);
		getUsernameText();
		enterUserName(strusername);
		Thread.sleep(2000);
		enterPassword(strpassword);
		Thread.sleep(2000);
		clickloginbutton();
		Thread.sleep(2000);
	}
	
	public void logoutOperation() throws InterruptedException {
		selectdropdown();
		Thread.sleep(2000);
		clicklogout();
		Thread.sleep(2000);
	}
}
