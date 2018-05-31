package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// *********Page Variables*********
	String baseURL = "https://csltd.com.ua/";

	// *********Web Elements*********
	// String searchFieldClass = "pure-menu-link squared scope";
	String serchWord = "//a[@title='Поиск']";
	String elementLocation = "//form[@class='search-form active']/input[@name='search_form_type[term]']";
	String text = "DEVELOPER";
	// *********Page Methods*********

	// Go to HomePage
	public void goToHomePage() {
		driver.get(baseURL);
		// driver.navigate().to(baseURL)
	}

	public void goToSearchPage() {
		driver.get(serchWord);
		// driver.navigate().to(baseURL)
	}

	public void searchAction() {
		click(By.xpath(serchWord));

	}

	public void fillText( ) {
		writeText(By.xpath(elementLocation), text );
		
	}

	// public void fillSearchField() {
	// click(By.xpath(serchWord));
	//
	// driver.findElement(By.xpath("//form[@class='search-form
	// active']/input[@name='search_form_type[term]']"))
	// .sendKeys(Keys.ENTER);
	//
	// }

}
