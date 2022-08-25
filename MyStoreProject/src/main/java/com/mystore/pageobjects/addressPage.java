package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class addressPage extends BaseClass {

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOut;
	
	public  addressPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	public shippingPage clickOnCheckOut() {
		Action.click(getDriver(), proceedToCheckOut);
		return new shippingPage();
	}
}
