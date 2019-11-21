package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_Nov21 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		actionsExample4();
	}
	
	
	
	public static void actionsExample1() throws IOException
	{
		launchBrowser("https://flipkart.com");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions actions = new Actions(driver);
		
		Action action = actions.moveToElement(menu).build();
		
		action.perform();
		
		//actions.moveToElement(menu).build().perform();		
		
	}
	
	
	public static void actionsExample2() throws InterruptedException
	{
		
		launchBrowser("http://127.0.0.1:9999/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("username")).clear();
		
		Actions actions = new Actions(driver);
		
		driver.findElement(By.name("username")).click();
		
		actions.keyDown(Keys.SHIFT).sendKeys("admin").build().perform();
		
		actions.keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(4000);
		
		//actions.keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(4000);
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		actions.sendKeys("manager");
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		actions.sendKeys(Keys.SPACE).build().perform();
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		actions.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
	
	

	public static void actionsExample3() throws InterruptedException
	{
		/*
		 * launchBrowser("http://127.0.0.1:9999/login.do");
		 * 
		 * Actions actions = new Actions(driver);
		 * 
		 * WebElement userName = driver.findElement(By.name("username"));
		 */
		launchBrowser("https://erail.in/");
		
		driver.findElement(By.id("cmbQuota")).click();
		
		Actions actions = new Actions(driver);
		
		//actions.contextClick(userName).build().perform();
		
		//Thread.sleep(2000);
		
		//actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
		
		actions.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		
		actions.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		
		actions.sendKeys(Keys.ESCAPE).build().perform();
		
		Thread.sleep(2000);
		
		
		
		
	}
	
	

	
	public static void actionsExample4() throws InterruptedException 
	{
		
		launchBrowser("https://www.javatpoint.com/oprweb/test.jsp?filename=htmldraganddrop1");
		
		driver.switchTo().frame("iframewrapper");
		
		Thread.sleep(4000);
		
		WebElement source = driver.findElement(By.id("drag1"));
		WebElement dest = driver.findElement(By.id("div1"));
		
		Actions actions = new Actions(driver);	
		
		actions.dragAndDrop(source, dest).build().perform();
		
		
		
		
		
		
		
		
		
		
	

}
	
}
