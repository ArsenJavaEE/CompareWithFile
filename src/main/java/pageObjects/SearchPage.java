package pageObjects;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	String searchWord = "DEVELOPER";
	String xPathLocation = "//form[@class='search-form active']/input[@name='search_form_type[term]']";

	public void getAllWebERlement() throws IOException {
		WebElement linkListH1 = driver.findElement(By.xpath("//h2"));
		List<WebElement> linkList = driver.findElements(By.xpath("//a"));

		WebElement linkListH = driver.findElement(By.tagName("h2"));

		if (linkListH1 == linkListH) {
			for (int k = 0; k <= 2; k++) {

				WebDriver driver = new ChromeDriver();

				driver.get("https://csltd.com.ua/search/?search_form_type%5Bterm%5D=DEVELOPER");

				java.util.List<WebElement> linksH = driver.findElements(By.tagName("h2"));
				for (int i = 1; i <= linksH.size(); i = i + 1)

				{
					FileWriter writecsv1 = new FileWriter("//myTest.csv");
					String[] Arr = null;
					Arr[linksH.size() - 1] = linksH.get(i).getText();
					writecsv1.append('\n');
				}

			}
		} else {

			WebDriver driver = new ChromeDriver();
			driver.get("https://csltd.com.ua/search/?search_form_type%5Bterm%5D=DEVELOPER");

			java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
			for (int i = 1; i <= links.size(); i = i + 1)

			{

				FileWriter writecsv = new FileWriter("//myTest.csv");
				String[] Arr2 = null;
				Arr2[links.size() - 1] = links.get(i).getText();
				writecsv.append('\n');
			}

		}

	}

}
