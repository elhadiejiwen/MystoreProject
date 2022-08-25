package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class orderPage extends BaseClass {

	
	@FindBy(xpath= "//td[@class='cart_unit']/span/span")
	WebElement unitPrice;
	
	@FindBy(id= "total_price")
	WebElement totalPrice;
	
	@FindBy(xpath= "//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOut;
	
	public  orderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public double getUnitPrice() {
		String unitPrice1 = unitPrice.getText();
		String unit = unitPrice1.replaceAll("[^a-zA-Z0-9]", "");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice/100;
	}
	
	public double getTotalPrice() {
		String totalPrice1 = unitPrice.getText();
		String tot = totalPrice1.replaceAll("[^a-zA-Z0-9]", "");
		double finalUnitPrice = Double.parseDouble(tot);
		return finalUnitPrice/100;
	}
	
	public LoginPage clickOnCheckOut() {
		Action.click(getDriver(), proceedToCheckOut);
		return new LoginPage();
	}
}
