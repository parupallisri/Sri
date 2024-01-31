package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		 
		   driver.get("https://demoqa.com/menu#");
		   driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']")).click();
		//   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']")).click();
		   Thread.sleep(2000);
		   driver.quit();

	}

}
