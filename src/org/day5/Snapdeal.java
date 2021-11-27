package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement btnSign = driver.findElement(By.xpath("//div[@class='accountInner']"));
		btnSign.click();
		WebElement btnRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnRegister.click();
		Thread.sleep(3000);
		WebElement txtMobNo = driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly']"));
		txtMobNo.sendKeys("abd");
		
		
	}
	
	
	

}
