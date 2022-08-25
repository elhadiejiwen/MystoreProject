package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass {

	
	@FindBy(xpath ="//span[text() = 'My wishlists']")
	WebElement myWishliste;
	
	@FindBy(xpath = "//span[text() ='Order history and details']")
	WebElement orderHistory;
	
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateMyWishList() {
		
		return Action.isDisplayed(getDriver(), myWishliste);
		
	}
	
   public boolean validateOrderHistory() {
		
		return Action.isDisplayed(getDriver(), orderHistory);
		
	}
   
   public String getCurrUrl() {
	   String currentUrl = getDriver().getCurrentUrl();
	   return currentUrl;
   }
}
