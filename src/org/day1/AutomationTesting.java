package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	
	public static void main(String[] args) {
		
		System.setProperty("webdrive.chrome.drive", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtUserName = driver.findElement(By.id("First Name"));
		
		txtUserName.sendKeys("jawahar");
		
	}
	
	

}
