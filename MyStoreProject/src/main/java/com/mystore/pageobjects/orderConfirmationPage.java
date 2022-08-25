package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class orderConfirmationPage extends BaseClass {

	
	@FindBy(xpath = "//p/strong[contains(text(), 'Your order on My Store is complete.']")
	WebElement confirmMessage;
	
	public orderConfirmationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String validateConfirMessage() {
		String message = confirmMessage.getText();
		return message;
		
	}
}
