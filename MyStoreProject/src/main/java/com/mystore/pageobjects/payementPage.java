package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class payementPage extends BaseClass {

	@FindBy(xpath = "//a[contains(text(), Pay by bank wire')]")
	WebElement bankWireMethod;
	
	@FindBy(xpath = "//a[contains(text(), Pay by check')]")
	WebElement payByCheckMethod;
	
	
	public  payementPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public orderSummary clickOnPayementMethod() {
		Action.click(getDriver(), bankWireMethod);
		return new orderSummary();
	}
}
