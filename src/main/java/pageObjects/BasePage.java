package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static WebDriver driver;
	public WebDriverWait wait;

	public BasePage(WebDriver driver, WebDriverWait wait) {
		BasePage.driver = driver;
		this.wait = wait;
	}

	// Click Method
	public void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}

	// Write Text
	public void writeText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(Keys.ENTER);
	}

	// Read Text
	public String readText(By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}

}
