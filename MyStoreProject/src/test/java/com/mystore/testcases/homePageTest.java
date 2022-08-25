package com.mystore.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class homePageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	@Before
	public void setUp() {
		loadConfig();
		lancerApp();
		goTo();
	}
	
	@Test
	public void wishList() {
		indexPage = new IndexPage();
		loginPage=indexPage.clickSignIn();
		homePage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homePage.validateMyWishList();
		assertTrue(result);
	}
	
	@Test
	public void orderHistoryandDetailsTest() {
		indexPage = new IndexPage();
		loginPage=indexPage.clickSignIn();
		homePage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homePage.validateOrderHistory();
		assertTrue(result);
	}
}
