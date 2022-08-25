package com.mystore.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	AccountCreationPage acountCreationPage;
	@Before
	public void setUp() {
		loadConfig();
		lancerApp();
		goTo();
	}

	@Test
	public void verifyCreateAccountPage() throws InterruptedException {
		indexPage = new IndexPage();
		loginPage=indexPage.clickSignIn();
		acountCreationPage = loginPage.createAccount("elhadi@gm.com");

		boolean result = false;
		try {
			result = acountCreationPage.validateAccountCreatePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(result);
		 
	}
}
