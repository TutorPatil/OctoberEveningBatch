package com.selenium.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.base.BaseClass;

public class FileUploadAndAutoITRobot extends BaseClass{
	
	
	//@Test
	public static void fileUpoadExample1() throws IOException, InterruptedException
	{
		
		driver.get("http://jkorpela.fi/forms/file.html");
		
		File f = new File("E:\\sample.bat");
		
		String s = f.getAbsolutePath();
		
		System.out.println(s);
		
		//driver.findElement(By.name("datafile")).sendKeys("E:\\sample.bat");
		
		//String s1 = driver.findElement(By.name("datafile")).getAttribute("value");
		
		//System.out.println(s1);
		
		Thread.sleep(4000);
		
		//driver.findElement(By.name("datafile")).click();
		
		Runtime.getRuntime().exec("E:\\FileUpload.exe");
		
		
		
		
		
	}

	
	@Test
	public static void fileUpoadExampleRobotClass() throws IOException, InterruptedException, AWTException
	{
		
		driver.get("http://jkorpela.fi/forms/file.html");
		
		
		Thread.sleep(4000);
		
				
		Robot robot = new Robot();
		
		
		StringSelection stringSelection = new StringSelection("E:\\FileUpload.exe");		
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, null);
		
	    
	   
	    
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_ENTER);
		
	}

	
}
