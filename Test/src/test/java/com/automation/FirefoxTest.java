package com.automation;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {
  WebDriver driver;
  static String baseURL;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
	
	//	WebDriver driver = new FirefoxDriver();
		   WebDriver driver = new FirefoxDriver();
		   baseURL = "https://demoqa.com/webtables";
			//driver.manage().timeouts().im(10, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get(baseURL);
		   driver.quit();
	}
		@Test   
		  public void test() throws InterruptedException {
			   
		   WebElement bmwRadioBtn = driver.findElement(By.id("item-2"));
		   bmwRadioBtn.click();
		   Thread.sleep(2000);
		   
	}
		@After
		  public void tearDown() throws Exception {
			
			Thread.sleep(2000);
			driver.quit();
		}
}
		

//}
