package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		
		WebElement textOverview = driver.findElement(By.xpath("//span[@title='Overview']"));
		
		textOverview.click();
		
		Thread.sleep(3000);
		
     	WebElement textAbout = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		
		String textSelenium = textAbout.getText();
		
		System.out.println(textSelenium);
		
	}
}
