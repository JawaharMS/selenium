package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://sprint.com/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		WebElement txtSprint = driver.findElement(By.id("tntButtonToClose"));
		txtSprint.click();
		WebElement txtPh = driver.findElement(By.id("digital-header-nav-link-head-1"));
		actions.moveToElement(txtPh).perform();
		WebElement txt5G = driver.findElement(By.xpath("//span[text()='5G phones']"));
		txt5G.click();
		Thread.sleep(3000);
		WebElement txtPrt = driver.findElement(By.xpath("(//a[@target='_self'])[215]"));
		String text = txtPrt.getText();
		System.out.println(text);
		
		
	}

}
