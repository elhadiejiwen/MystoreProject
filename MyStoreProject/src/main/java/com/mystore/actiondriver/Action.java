package com.mystore.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mystore.base.BaseClass;

public class Action extends BaseClass{
	
	public static void scroolByVisibilityOfElement(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("argument[0].scrollIntoView()", element);
		
	}
	
	public static void click(WebDriver ldriver, WebElement locatorName) {
		
		Actions act = new Actions(ldriver);
		act.moveToElement(locatorName).click().build().perform();	
		
	}
	
	public static boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag = true;
	   } catch (Exception e) {
		   System.out.println("Location not found");
		   flag = false;
	   } finally{
		   if(flag) {
			   System.out.println("successfully entered value");
			   
		   } else {
			   System.out.println("unable to enter value");

		   }
	   }
		return flag;
	}
	
	public static boolean selectBySendKeys(WebElement ele, String value) {
		boolean flag = false;
		try {
			
			
			ele.sendKeys(value);
			flag = true;
			return true;
	   } catch (Exception e) {
		   
		   return false;
	   } finally{
		   if(flag) {
			   System.out.println("select value from the DropDown");
			   
		   } else {
			   System.out.println("Not select value from the dropdown");

		   }
	   }
	}
	
	public static boolean selectByIndex(WebElement ele, int index) {
		boolean flag = false;
		try {
			
			Select s = new Select(ele);
			s.selectByIndex(index);
			flag = true;
			return true;
	   } catch (Exception e) {
		   
		   return false;
	   } finally{
		   if(flag) {
			   System.out.println("Option selected by index");
			   
		   } else {
			   System.out.println("Option not selected by index");

		   }
	   }
	}

	public static boolean selectByValue(WebElement ele, String value) {
		boolean flag = false;
		try {
			
			Select s = new Select(ele);
			s.selectByValue(value);
			flag = true;
			return true;
	   } catch (Exception e) {
		   
		   return false;
	   } finally{
		   if(flag) {
			   System.out.println("Option selected by value");
			   
		   } else {
			   System.out.println("Option not selected by value");

		   }
	   }
	}
	public static boolean selectByVisibleText(WebElement ele, String visibleText) {
		boolean flag = false;
		try {
			
			Select s = new Select(ele);
			s.selectByVisibleText(visibleText);
			flag = true;
			return true;
	   } catch (Exception e) {
		   
		   return false;
	   } finally{
		   if(flag) {
			   System.out.println("Option selected by visible text");
			   
		   } else {
			   System.out.println("Option not selected by visible text");

		   }
	   }
	}
	
	public static boolean JSClick(WebDriver driver, WebElement ele) {
		
		boolean flag = false;
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
			flag = true;
		} catch ( Exception e) {
			
			throw e;
		} finally {
			if (flag) {
				System.out.println("Click action is performed");
				
			}else if(!flag) {
				System.out.println("Click action is not performed");
			}
		}
		
		return false;
	}
	
	public static boolean switchToFrameById (String idValue) {
		boolean flag = false;
		try {
			
			getDriver().switchTo().frame(idValue);
			flag = true;
			return true;
		} catch ( Exception e) {
			
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println("frame with id" + idValue+ "is selected");
				
			}else if(!flag) {
				System.out.println("frame with id\" + idValue+ \"is not selected");
			}
		}
		
		
		return false;
		
	}

	public static boolean isDisplayed(WebDriver driver, WebElement myStoreLogo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		 try {
			 myStoreLogo.isDisplayed();
			 flag = true;
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		return flag;
	}
	
	
}
