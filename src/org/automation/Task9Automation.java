package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9Automation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Day2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	txtFirstName.sendKeys("Sundar");
	WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	txtLastName.sendKeys("Gaja");
	
	}
}
