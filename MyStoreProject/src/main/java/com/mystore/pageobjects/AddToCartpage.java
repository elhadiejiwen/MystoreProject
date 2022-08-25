package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddToCartpage extends BaseClass{

	@FindBy(id ="quantity_wanted")
	WebElement quantity;
	
	@FindBy(name ="group_1")
	WebElement size;
	
	@FindBy(xpath ="//span[text()='Add to cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath ="//*[@id= \"layer_cart\"]//h2/i")
	WebElement addToCartMessage;
	
	@FindBy(xpath ="//span[contains(text(), 'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	
	public  AddToCartpage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterQuantity(String quantity1) {
		
		 Action.type(quantity,quantity1);
	}
	
	public void selectSize(String size1) {
		
		Action.selectByVisibleText(size, size1);
		
	}
	
	public void clickOnAddToCart() {
		Action.click(getDriver(), addToCartBtn);
	}
	
	public boolean validateAddToCart() {
		return Action.isDisplayed(getDriver(), addToCartMessage);
	}
	
	public orderPage clickOnCheckOut() {
		Action.JSClick(getDriver(), proceedToCheckOutBtn);
		return new orderPage();
		
	}
}
