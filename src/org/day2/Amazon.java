package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearch.sendKeys("iphone");
		WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
		btnSearch.click();
	
	}

}
