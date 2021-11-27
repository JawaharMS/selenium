package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		
		txtUserName.sendKeys("Ram Kumar");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		
		txtPassword.sendKeys("Hello@12345");
		
				
	}
	
	
	
	
	
}
