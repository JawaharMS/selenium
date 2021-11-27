package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		
		txtUserName.sendKeys("jawaharms78@gmail.com");
				
		WebElement txtPassword = driver.findElement(By.id("password"));
		
		txtPassword.sendKeys("Good@1234");
		
				
	}

}
