package com.selenium.part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","Resources\\Drivers\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Type 1
//		WebElement row = driver.findElement(By.id("customers"));
//		List <WebElement> tablerows = row.findElements(By.tagName("tr"));
		
		//Type 2
		List <WebElement> tablerows = driver.findElement(By.id("customers")).findElements(By.tagName("tr"));
		
		int rowcount = tablerows.size();
		System.out.println("Total rows in a table: " + rowcount);
		
		for(int i = 2; i < rowcount; i++)
		{
			//System.out.println(i + " " + tablerows.get(i).findElement(By.tagName("td")));
			List <WebElement> tablecols = tablerows.get(i).findElements(By.tagName("td"));
			int colcount = tablecols.size();
			//System.out.println(colcount);
			System.out.println("Row : " + i);
			for(int j = 1; j <= colcount; j++)
			{
				String rowvalues = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText();            
				System.out.println("Coloumn "+ j + " : " + rowvalues);
			}
			System.out.println("\n**************");
		}
		
		driver.close();

	}
}
	