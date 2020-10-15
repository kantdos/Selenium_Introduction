package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello Again!");

		// ChromeOptions options = new ChromeOptions();
		// options.setHeadless(true); // Set Chrome option
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // options
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.linkText("https://www.google.co.in/intl/en/about/products?tab=rh")).click();
		//System.out.println(driver.getPageSource());
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		
	}
}
