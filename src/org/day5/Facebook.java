package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement btnCrtNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCrtNewAcc.click();
		Thread.sleep(3000);
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		txtFirstName.sendKeys("Jawahar");
		
	}

}
