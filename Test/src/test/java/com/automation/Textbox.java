package com.automation;

 import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//  import org.openqa.selenium.webdriver;
   import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textbox {

	public static void main(String[] args) throws Exception {
	   
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demoqa.com/text-box");
	   driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Sri");
	   driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("parupallisrilu@gmail.com");
	   driver.findElement(By.xpath(" //textarea[@id='currentAddress']")).sendKeys("Siris road");
	   //Thread.sleep(5000);
	   driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Sai surya marvels,hyd");
	  // Thread.sleep(5000);
	   driver.findElement(By.id("submit")).click();
	   //Thread.sleep(5000);submit
	   //driver.findElement(By.id(null))
	 
       driver.quit();
     }
}
