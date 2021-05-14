package com.testng.firstpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testone {

	WebDriver driver;  
	@Test
	public void test1() {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		//WebDriverManager.chromedriver().setup();			
		//driver=new ChromeDriver();
		driver.get("http://jupiter.cloud.planittesting.com/");
		System.out.println("Got the title in TestNG"+ driver.getTitle());
		driver.quit();
		
		
        
	}
}
