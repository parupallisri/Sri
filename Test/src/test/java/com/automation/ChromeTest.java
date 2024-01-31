package com.automation;

 import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//  import org.openqa.selenium.webdriver;
   import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	public static void main(String[] args) throws Exception {
	   
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demoqa.com/radio-button");
	   driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
	   Thread.sleep(5000);
       driver.quit();
     }
}
