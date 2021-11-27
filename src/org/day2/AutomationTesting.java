package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("Jawahar");
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Meenachisundaram");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAddress.sendKeys("2/140, Milladi Street, Mukkarumbur, Mayiladuthurai-609309");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtEmail.sendKeys("jawaharms78@gmail.com");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		txtPhone.sendKeys("9585288225");
		WebElement buttonGender = driver.findElement(By.xpath("//input[@ng-model='radiovalue']"));
		buttonGender.click();
		WebElement buttonHobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
		buttonHobbies.click();
		WebElement buttonMovies = driver.findElement(By.xpath("//input[@value='Movies']"));
		buttonMovies.click();
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		txtPassword.sendKeys("jawa@12345");
		WebElement txtSecondpassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		txtSecondpassword.sendKeys("jawa@12345");
		WebElement buttonSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		buttonSubmit.click();
		
	}
}
