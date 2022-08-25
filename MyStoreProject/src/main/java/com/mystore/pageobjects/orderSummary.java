package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class orderSummary extends BaseClass {

	
	@FindBy(xpath = "//span[contains(text(), 'I confirm my order']")
	WebElement confirmOrderBtn;
	
	public orderSummary() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public orderConfirmationPage clickOnconfirmOrderBtn() {
		
		Action.click(getDriver(), confirmOrderBtn);
		return new orderConfirmationPage();
	}
}
