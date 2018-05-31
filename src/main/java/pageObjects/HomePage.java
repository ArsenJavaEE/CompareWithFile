package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	String baseURL = "https://csltd.com.ua/";

	String serchWord = "//a[@title='Поиск']";
	String elementLocation = "//form[@class='search-form active']/input[@name='search_form_type[term]']";
	String text = "DEVELOPER";
 
	public void goToHomePage() {
		driver.get(baseURL);
		// driver.navigate().to(baseURL)
	 } 
 
	public void goToSearchPage() {
		driver.get(serchWord);

	}

	public void searchAction() {
		click(By.xpath(serchWord));

	}

	public void fillText() {
		writeText(By.xpath(elementLocation), text);

	}

}
