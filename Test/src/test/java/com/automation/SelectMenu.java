package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMenu {

	public static void main(String[] args) throws InterruptedException {
		//div[contains(text(),'Select Option')]
		
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		 
		   driver.get("https://demoqa.com/select-menu");
		   driver.findElement(By.xpath("//div[contains(text(),'Select Option')]")).click();
		   WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		   Select selectobject = new Select(dropdown);
		   selectobject.selectByIndex(1);
		   selectobject.selectByValue("1");
		   selectobject.selectByVisibleText("Yellow");
		   Thread.sleep(2000);
		   driver.quit();
		   System.out.println("Done");
		   
	}

}
