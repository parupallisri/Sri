package com.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException  {

		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		
	       driver.get("https://demoqa.com/browser-windows");
	       driver.findElement(By.id("tabButton")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("windowButton")).click();
	       Thread.sleep(4000);
	       driver.findElement(By.id("messageWindowButton")).click();
	       Thread.sleep(2000);
	       driver.quit(); 
	      
	}
}