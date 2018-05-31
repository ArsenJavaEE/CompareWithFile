package tests;

import java.io.IOException;

import org.junit.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;

public class HomeTest extends BaseTest{
	
	@Test 
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException, IOException {
		HomePage homePage = new HomePage(driver,wait);
        SearchPage searchPage = new SearchPage(driver,wait);
        
        homePage.goToHomePage();
        homePage.searchAction();
        homePage.fillText();
        searchPage.getAllWebERlement();
	}
	}



