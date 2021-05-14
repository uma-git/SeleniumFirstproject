package com.testng.firstpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestng {

	WebDriver driver;  
	@Test
	public void test1() {
 	 
		WebDriverManager.chromedriver().setup();			
		driver=new ChromeDriver();
		driver.get("http://jupiter.cloud.planittesting.com/");
		System.out.println("Got the title in TestNG"+ driver.getTitle());
		driver.quit();
	}
}
