package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accordian {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		   
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   driver.get("https://demoqa.com/accordian");
		   driver.findElement(By.id("section1Heading")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.id("section2Heading")).click();
		   Thread.sleep(3000);
		   js.executeScript("window.scrollBy(0,350)", "");
		   driver.findElement(By.id("section3Heading")).click();
	}

}
