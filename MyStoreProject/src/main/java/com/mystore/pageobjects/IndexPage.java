package com.mystore.pageobjects;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(xpath ="//a[@class='login']")
	WebElement signInBtn;

	@FindBy(xpath ="//img[@class='logo img-responsive']")
	WebElement myStoreLogo;
	
	@FindBy(id ="search_query_top")
	WebElement searchProductBox;
	
	@FindBy(name ="submit_search")
	WebElement searchButton;
	
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public LoginPage clickSignIn() {
		Action.click(getDriver(),signInBtn);
		return new LoginPage();
	}
	
	public boolean validateLogo() {
		return Action.isDisplayed(getDriver(), myStoreLogo);
	}
	
	public String getMyStoreTitle() {
		String myStoretitle = getDriver().getTitle();
		return myStoretitle;
	}
	
	public searchResultPage searchProduct(String productName) {
		
		Action.type(searchProductBox, productName);
		Action.click(getDriver(), searchButton);
		return new searchResultPage();
	}
}
