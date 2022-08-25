package com.mystore.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.log;

public class loginPageTest extends BaseClass{
	
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
	public void loginTest() {
		log.startTestCase("loginTest");
		indexPage = new IndexPage();
		log.info("user is going to click on signIn");
		loginPage = indexPage.clickSignIn();
		log.info("enter username and password");
		homePage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
		String actualUrl = homePage.getCurrUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=my-account";
		assertEquals(actualUrl, expectedUrl);
		
	}

}
