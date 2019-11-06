package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonLibrary {
	
	public static WebDriver driver = null;	
	
	
	public static void launchBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
		
		driver = new ChromeDriver();		
		
		driver.get(url);
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}

	
	

}
