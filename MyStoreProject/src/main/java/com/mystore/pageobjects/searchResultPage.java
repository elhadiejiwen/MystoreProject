package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class searchResultPage extends BaseClass {

	
	@FindBy(xpath ="//*[@id=\"center_column\"]//img")
	WebElement productResult;
	
	public  searchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean isProductAvailable() {
		
		return Action.isDisplayed(getDriver(), productResult);
	}
	
	public AddToCartpage clickOnProduct() {
		
		Action.click(getDriver(), productResult);
		return new AddToCartpage();
	}
}
