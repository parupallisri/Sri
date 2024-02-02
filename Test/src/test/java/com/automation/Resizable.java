package com.automation;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Resizable {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/resizable");
			Thread.sleep(2000);
			JavascriptExecutor js= (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,300)","");
            WebElement element=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));
		    Actions actions = new Actions(driver);
		    actions.dragAndDropBy(element, 100, 100).perform();
		    Thread.sleep(2000);
		    actions.dragAndDropBy(element, -10, -50).perform();
		    Thread.sleep(2000);
		    actions.dragAndDropBy(element, 100, 100).perform();
            driver.quit();
		}

	}

