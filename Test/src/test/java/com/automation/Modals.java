package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Modals {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/modal-dialogs");
		   driver.findElement(By.id("showSmallModal")).click();
		   Thread.sleep(3000);
		//   JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,350)", "");
		   driver.findElement(By.id("showLargeModal")).click();
	}

}

