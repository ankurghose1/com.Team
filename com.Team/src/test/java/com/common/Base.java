package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver getdriver() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://chegg-qa-challenge.herokuapp.com/login");
	//	driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}

}
