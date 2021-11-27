package ord.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	driver.manage().window().maximize();
	
	WebElement frameSwitch = driver.findElement(By.xpath("//frame[@name='login_page']"));
	driver.switchTo().frame(frameSwitch);
	
	WebElement userId = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
	userId.sendKeys("9585288225",Keys.ENTER);
	
	WebElement userPassword = driver.findElement(By.name("fldPassword"));
	userPassword.sendKeys("12345678", Keys.ENTER);
	
	}
}
