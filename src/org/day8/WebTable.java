package org.day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		int size = tRows.size();
		System.out.println(size);
		
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		int size2 = tData.size();
		System.out.println(size2);
		
		System.out.println("Total number of odd options");
		
		for (int i = 1; i < tData.size(); i= i+2) {
			WebElement x = tData.get(i);
			String text = x.getText();
			System.out.println(text);
			
			}
		System.out.println("**********************************************************");
	
		System.out.println("Total number of even options");
		
		for (int i = 0; i < tData.size(); i=i+2) {
			WebElement y = tData.get(i);
			String text2 = y.getText();
			System.out.println(text2);
			
		}
	}
	
	}
