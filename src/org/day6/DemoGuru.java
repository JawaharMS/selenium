package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		WebElement txtBankDebit = driver.findElement(By.id("credit2"));
		WebElement txt = driver.findElement(By.id("bank"));
		WebElement txt51 = driver.findElement(By.id("fourth"));
		WebElement txtAmt = driver.findElement(By.id("amt7"));
		WebElement txtSale = driver.findElement(By.id("credit1"));
		WebElement txtCreditAcct = driver.findElement(By.id("loan"));
		WebElement txt52 = driver.findElement(By.id("fourth"));
		WebElement txtAmt2 = driver.findElement(By.id("amt8"));
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(txtBankDebit, txt).perform();
		actions.dragAndDrop(txt51, txtAmt).perform();
		actions.dragAndDrop(txtSale, txtCreditAcct).perform();
		actions.dragAndDrop(txt52, txtAmt2).perform();
	}

}
