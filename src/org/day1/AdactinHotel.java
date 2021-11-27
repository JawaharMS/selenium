package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));		
		txtUserName.sendKeys("Jawahar");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		
		txtPassword.sendKeys("Hai@123456");
				
	}

}
