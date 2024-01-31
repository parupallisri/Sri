package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		 
		   driver.get("https://demoqa.com/tabs");
		   driver.findElement(By.xpath("//a[@id='demo-tab-origin']")).click();
		   Thread.sleep(2000);
		   driver.quit();

	}//a[@id='demo-tab-origin']

}
