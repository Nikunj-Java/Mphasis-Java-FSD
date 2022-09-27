package com.simplilearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32_Sep_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		//locating web elements 
		
		//by id
		WebElement email_id= driver.findElement(By.id("email"));
		//by name
		WebElement email_name= driver.findElement(By.name("email"));
		
		System.out.println("Email By Id and Name:"+email_id.equals(email_name));
		
		
		
		//find link text
		
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		
		//by relative path(Xpath)
		
		WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		System.out.println("Email by Xpath and Id :"+email_id.equals(email_xpath));
		
		//by full xpath
		WebElement email_full_xpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		System.out.println("Email by Xpath and Full Xpath: "+email_full_xpath.equals(email_xpath));
	    
		
		//by using selector (CSS selector)
		
		WebElement email_cssSelector=driver.findElement(By.cssSelector("#email"));
		System.out.println("Email By CSS Selector and Xpath is: "+email_cssSelector.equals(email_xpath));
		
		//List of web elements
		List<WebElement> list=driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) {
			System.out.println("List of WebElements : "+e.getAttribute("placeholder"));
		}
		
		//by tag
		WebElement password= driver.findElement(By.cssSelector("input[name=pass]"));
		System.out.println("Password using Tag: "+password.getAttribute("placeholder"));
		
		driver.close();
		 
		
	 
		
		
		
		
	}

}
