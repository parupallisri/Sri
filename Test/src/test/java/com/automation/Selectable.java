package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.AWTException;

	public class Selectable {

		static WebDriver driver;

		@Test
		public static void checkBoxDemo() throws InterruptedException, AWTException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/selectable");
			Thread.sleep(2000);			
			Actions actions = new Actions(driver);
	        actions.scrollByAmount(0, 300).perform();
	        Thread.sleep(2000); 	        
	        driver.findElement(By.xpath("//li[normalize-space()='Morbi leo risus']")).click();
			Thread.sleep(2000);			
			driver.findElement(By.xpath("//li[normalize-space()='Cras justo odio']")).click();
			Thread.sleep(2000);	        
	       driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
			Thread.sleep(2000);			
			driver.findElement(By.xpath("//li[normalize-space()='One']")).click();
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//li[normalize-space()='Four']")).click();
			Thread.sleep(2000);			
			driver.close();
		}
		}
