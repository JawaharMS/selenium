package org.day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAutomation {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement txtS = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]"));
		txtS.click();
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Alert al = driver.switchTo().alert();
		al.sendKeys("Jawahar");
		al.accept();
		
		WebElement txtText = driver.findElement(By.id("demo1"));
		String txt = txtText.getText();
		System.out.println(txt);
		
	}

}
