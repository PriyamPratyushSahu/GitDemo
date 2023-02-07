package com.selenium.part4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POFPage {
	
	WebDriver driver;
	
	@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(2)")
	WebElement usernametext;
	
	@FindBy(css = "input[placeholder='Username']")
	WebElement username;
	
	@FindBy(css = "input[placeholder='Password']")
	WebElement password;
	
	@FindBy(css = "button[type='submit']")
	WebElement login;
	
	@FindBy(css = "#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > img")
	WebElement dropdown;
	
	@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")
	WebElement logout;
	
	
//	By usernametext = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(2)"); 
//	By username = By.cssSelector("");
//	By password = By.cssSelector("input[placeholder='Password']");
//	By login = By.cssSelector("button[type='submit']");
//	By dropdown = By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > img");
//	By logout = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");

	
	public POFPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
