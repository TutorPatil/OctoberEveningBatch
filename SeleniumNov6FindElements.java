package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumNov6FindElements {
	
	public static void main(String[] args) {
		getEmailIds();
	}

	public static void findElementsExample1()
	{
		CommonLibrary.launchBrowser("file:///C:/Users/H/Desktop/Selenium_EveningBatch/login.html");
		
		List<WebElement> list = CommonLibrary.driver.findElements(By.xpath("//table[@id='tbl1']/tbody/tr[2]/td"));
		
		for(WebElement m : list)
		{
			System.out.println(m.getText());
		}
		
		CommonLibrary.closeBrowser();	
		
	}
	
	
	public static void findElementsExample2()
	{
		
		
		CommonLibrary.launchBrowser("https://demo.actitime.com/login.do");
		
		List<WebElement> links = CommonLibrary.driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		for(WebElement m : links)
		{
			System.out.println(m.getText());
		}
		
		System.out.println("===============");
		
		
		for(WebElement m : links)
		{
			System.out.println(m.getAttribute("href"));
		}
		
		
		/*
		CommonLibrary.driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).click();
		
		List<WebElement> links1 = CommonLibrary.driver.findElements(By.xpath("//a"));
		
		System.out.println(links1.size());
		
		for(WebElement m : links1)
		{
			System.out.println(m.getText());
		}
		*/
		CommonLibrary.closeBrowser();
		
	}
	
	
	public static void clickOnHiddenLink()
	{
		
		
		CommonLibrary.launchBrowser("https://demo.actitime.com/login.do");
		
		CommonLibrary.driver.findElement(By.xpath("//a[@id='inProgressText']")).click();
		
		
	}
	
	public static void getEmailIds()
	{
		String xpath = "//table[@id='tbl1']/tbody/tr/td[text()='--TEXTTOREPLACE--']/../td[4]";
		
		
		CommonLibrary.launchBrowser("file:///C:/Users/H/Desktop/Selenium_EveningBatch/login.html");
		
		//String xpath1 = xpath.replace("--TEXTTOREPLACE--", "Ramu");
		
		//System.out.println(CommonLibrary.driver.findElement(By.xpath(xpath1)).getText());
		
		
		String emailid = CommonLibrary.driver.findElement(By.xpath(xpath.replace("--TEXTTOREPLACE--", "Shamu"))).getText();
		
		System.out.println(emailid);
		
		CommonLibrary.closeBrowser();
		
	}
	
	
	
	
	
	
	
	
	
}
