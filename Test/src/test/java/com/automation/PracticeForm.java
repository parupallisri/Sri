package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		   
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		 
		   driver.get("https://demoqa.com/automation-practice-form");
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sri");
		   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("L");
		   driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("paru@gmail.com");  
		   driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		   driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("2032232565");
		   js.executeScript("window.scrollBy(0,350)", "");
		   //driver.findElement(By.xpath("//body/div[@id='fixedban']/div/div[1]")).sendKeys("27 jan 2010");
		  // driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		  // js.executeScript("window.scrollBy(0,350)", "");
		//   driver.findElement(By.id("subjectsContainer")).sendKeys("English");
		  // driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("English");
		  // driver.findElement(By.id("hobbies-checkbox-1")).click();
		//   driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//div[2]")).click();
		 //  Thread.sleep(2000);
		 //label[@for='hobbies-checkbox-1']
		 //div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//div[2]
		   //driver.findElement(By.cssSelector(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")).sendKeys("English");
		  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		// driver.findElement(By.id("hobbies-checkbox-1")).click();
		  driver.findElement(By.id("currentAddress")).sendKeys("HYD");
		  js.executeScript("window.scrollBy(0,350)", "");
		  	}
		   
		   }
