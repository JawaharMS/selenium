package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','Ramkumar')", txtUserName);
		Object name = executor.executeScript("return arguments[0].getAttribute('value')", txtUserName);
		System.out.println(name);
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','Hello@1234')", txtPassword);
		Object pass = executor.executeScript("return arguments[0].getAttribute('value')", txtPassword);
		System.out.println(pass);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()", btnLogin);
	}}	
		
		
		
	


