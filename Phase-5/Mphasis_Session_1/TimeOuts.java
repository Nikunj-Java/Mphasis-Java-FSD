package com.simplilearn.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOuts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32_Sep_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//script timeout
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		//the page load timeout is the method  used to set the time for
		//the entire page load prior to throwing an exception.
		//if the timeout time is set to negative , then the time taken 
		//to load the page is endless.
		
		
		//pageload timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		//explicit wait
		WebDriverWait explicitwait=new WebDriverWait(driver, 10);
		explicitwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("nikunj@gmail.com");
				
				 
	}
}
