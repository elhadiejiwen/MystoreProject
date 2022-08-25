package com.mystore.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class searchResultPageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	com.mystore.pageobjects.searchResultPage searchResultPage;
	AccountCreationPage acountCreationPage;
	@Before
	public void setUp() {
		loadConfig();
		lancerApp();
		goTo();
	}

	@Test
	public void productAvialabilityTest() {
		indexPage= new IndexPage();
		searchResultPage = indexPage.searchProduct("t-shirt");
		boolean result = searchResultPage .isProductAvailable();
		assertTrue(result);
	}

}
