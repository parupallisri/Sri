package com.automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Slider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/slider");
	  driver.findElement(By.xpath("//input[@type='range']")).click();

	   Actions actions= new Actions(driver);
	   actions.clickAndHold().moveByOffset(196,279).release().perform();
	   driver.quit();
	}

}
