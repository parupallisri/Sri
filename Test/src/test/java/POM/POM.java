package POM;
import org.openqa.selenium.WebDriver;

import com.qamate.orangehrm_selenium_automation.PageObjects.HomePage;

public class POM {



	private WebDriver driver;
	public POM(WebDriver driver){
		this.driver = driver;
	}
	public void perform(String username,String password){
		HomePage.getUserNameTextBox(driver).sendKeys(username);
		HomePage.getPasswordTextBox(driver).sendKeys(password);
		HomePage.getLoginButton(driver).click();
	}
}