package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDayOne\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_cms_IB_internetbanking_login_btn&_gl=1*1yusu2r*_ga*MTgzNTI1NjI1NS4xNjM0NjA2NTk0*_ga_SKB78GHTFV*MTYzNDYwNjU5NS4xLjAuMTYzNDYwNjU5NS42MA..&_ga=2.184448038.1658957504.1634606594-1835256255.1634606594");
		WebElement txtUserName = driver.findElement(By.id("DUMMY1"));
		txtUserName.sendKeys("jawahar");
		
	}
	}
