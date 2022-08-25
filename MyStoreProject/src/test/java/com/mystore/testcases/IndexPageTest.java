package com.mystore.testcases;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
//@RunWith(JUnit4.class)
public class IndexPageTest extends BaseClass {
	IndexPage indexPage;
	@Before
	public void setUp() {
		loadConfig();
		lancerApp();
		goTo();
	}

	@Test
	public void verifLogo() {
		
		indexPage = new IndexPage();
		boolean result = indexPage.validateLogo();
		//Assert.assertTrue(result);
		assertTrue(result);
		
	}
	@Test
	public void verifTitle() {
		indexPage = new IndexPage();
		String title = indexPage.getMyStoreTitle();
		//Assert.assertEquals(title, "My Store");
		assertEquals(title, "My Store");
	}
	
	@After
	public void quitApp() {
		getDriver().quit();
	}
	
}
