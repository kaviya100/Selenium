package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sanpdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\karthick\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	WebElement UserName = driver.findElement(By.id("userName"));
	UserName.sendKeys("nlakshmi9494@gmail.com");
	WebElement CheckUser = driver.findElement(By.id("checkUser"));
	CheckUser.click();
	
	
}
}
