package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10Acatin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Day2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("Sundar Gaja");
	WebElement txtPass = driver.findElement(By.id("password"));
	txtPass.sendKeys("Sundar@123");
	
	}
}
