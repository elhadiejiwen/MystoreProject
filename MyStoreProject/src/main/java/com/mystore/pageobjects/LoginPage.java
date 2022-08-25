package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy (id="email")
	WebElement username;
	
	@FindBy (id="passwd")
	WebElement passwordElement;
	
	@FindBy (id="SubmitLogin")
	WebElement signInBtnElement;
	
	@FindBy (name="email_create")
	WebElement emailForNewAccount;
	
	@FindBy (name="SubmitCreate")
	WebElement createNewAccountBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public addressPage login(String uname, String password) {
		Action.type(username, uname);
		Action.type(passwordElement, password);
		Action.click(getDriver(), signInBtnElement);
		return new addressPage();
	}
	
	public HomePage login1(String uname, String password) {
		Action.type(username, uname);
		Action.type(passwordElement, password);
		Action.click(getDriver(), signInBtnElement);
		return new HomePage();
	}
	
	public AccountCreationPage createAccount (String newEmail) {
		
		Action.type(emailForNewAccount, newEmail);
		Action.click(getDriver(), createNewAccountBtn);
		return new AccountCreationPage();
		
	}
}
