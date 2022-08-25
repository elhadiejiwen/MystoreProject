package com.mystore.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
public class AccountCreationPage extends BaseClass{
	
	@FindBy(xpath ="//h1[text() ='Create an account']")
	WebElement formTitle;
	
	@SuppressWarnings("deprecation")
	public  AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public boolean validateAccountCreatePage() throws InterruptedException{
		
		return Action.isDisplayed(getDriver(), formTitle);
	}

}
