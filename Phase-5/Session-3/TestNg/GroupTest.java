package com.simplileaern.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest {
	
	WebDriver driver=null;
	
	 
	
	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sep_new\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(groups = "Chrome",dependsOnMethods = {"launchChrome"})
	public void loginWithChrome() {
		
		driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikunj@123");
		driver.findElement(By.name("login")).submit();
		//driver.close();
	}
	
	@Test(groups = "Firefox")
	public void launchFireFox() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Phase-5\\geckodriver-v0.31.0-win64_new\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(groups = "Firefox",dependsOnMethods = {"launchFireFox"})
	public void  loginWithFireFox() {
		
		driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikunj@123");
		driver.findElement(By.name("login")).submit();
		//driver.close();
	}
  
}
