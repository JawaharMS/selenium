package org.day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.firstpost.com/firstcricket/series/t20/points-table");
		
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		int size = tRows.size();
		
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		int size2 = tData.size();
		
		for (int i = 0; i < 2; i++) {
			WebElement x = tRows.get(i);
			String text = x.getText();
			System.out.println(text);
			}
		
		for (int i = 0; i < 3; i++) {
			WebElement x = tRows.get(i);
			String text = x.getText();
			System.out.println(text);
			}
		
		for (int i = 0; i < 4; i++) {
			WebElement x = tRows.get(i);
			String text = x.getText();
			System.out.println(text);
			
		}
	}

}
