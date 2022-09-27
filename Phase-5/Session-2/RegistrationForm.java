package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sep_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Nikunj Soni");
				
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("nikunj@gamil.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9876543210");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Nikunj@123");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
		
		
	}

}
