package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		
		WebElement boxTable = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		boxTable.click();
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		
		File s = boxTable.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\ELCOT\\Documents\\Fritz 17.19 Multilingual\\Jawahar\\table.png");
		
		FileUtils.copyFile(s, d);
		
		
	}

}
