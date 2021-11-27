package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.greenstechnologys.com/");
		Actions actions=new Actions(driver);
		Thread.sleep(1000);
		WebElement txtCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		actions.moveToElement(txtCourse).perform();
		WebElement txtJava = driver.findElement(By.xpath("//span[text()='Java Training']"));
		actions.moveToElement(txtJava).perform();
		WebElement txtCoreJava = driver.findElement(By.xpath("//span[text()='Java Training']"));
		txtCoreJava.click();
		
		
	}

}
