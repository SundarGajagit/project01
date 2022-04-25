package org.instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8Insta {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Day2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement txtUserName = driver.findElement(By.name("username"));
	txtUserName.sendKeys("Sundargaja");
	WebElement txtPass = driver.findElement(By.name("password"));
	txtPass.sendKeys("Sundar@123");
	
	}
}
