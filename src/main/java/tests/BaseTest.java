package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
 
	@BeforeClass
	public void setup() {
		// Create a Chrome driver. All test and page classes use this driver.
		driver = new ChromeDriver();

		// Create a wait. All test and page classes use this wait.
		wait = new WebDriverWait(driver, 15);

		// Maximize Window
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
