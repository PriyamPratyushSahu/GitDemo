package com.selenium.part4;

import org.openqa.selenium.WebDriver;

public class POFUtilities {
	
	WebDriver driver;
	POFPage pofpage;

	public POFUtilities(WebDriver driver) {
		this.driver = driver;
		pofpage = new POFPage(driver);
	}
	
	public void getUsernameText()
	{
		
		System.out.println("Username text: " + pofpage.usernametext.getText());
	}
	
	public void enterUserName(String strusername)
	{
		pofpage.username.sendKeys(strusername);
		System.out.println("Username entered successfully");
		
	}
	
	public void enterPassword(String strpassword )
	{
		pofpage.password.sendKeys(strpassword);
		System.out.println("Password entered successfully");
		
	}
	
	public void clickloginbutton()
	{
		pofpage.login.click();
		System.out.println("Login button clicked successfully");
	
	}
	
	public void selectdropdown()
	{
		pofpage.dropdown.click();
		System.out.println("Drop down clicked successfully");
		
	}
	
	public void clicklogout()
	{
		pofpage.logout.click();
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
