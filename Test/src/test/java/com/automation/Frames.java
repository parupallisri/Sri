package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		   
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/nestedframes");
		   int count = driver.findElements(By.tagName("iframe")).size();
           System.out.println("Number of Frames on a Page:" + count);
	}
}