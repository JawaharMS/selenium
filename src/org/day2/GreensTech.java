package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnItrQns = driver.findElement(By.xpath("//div[@data-toggle='collapse']"));
		btnItrQns.click();
		WebElement btnCtsQns = driver.findElement(By.xpath("//span[@class='fas fa-arrow-right']"));
		btnCtsQns.click();
	}

}
