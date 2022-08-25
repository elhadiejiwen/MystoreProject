package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.DOMConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;

public class BaseClass {
	public static Properties prop;
	//public static WebDriver driver;
	
	       //public static WebDriver driver
	
			//Declare threadLocator Driver
			public static ThreadLocal<RemoteWebDriver> driver= new ThreadLocal <>();
			public static WebDriver getDriver() {
				
				return driver.get();
			}
				
			@BeforeTest
			public void beforeSuite() {
				//DOMConfigurator.configure("log4j.xml");
				DOMConfigurator.configure("log4j.xml");
			}
			
	        @BeforeTest
            public void loadConfig() {   
		
		
		     try {
		    	 prop = new Properties();
			    System.out.println("super constructer");
			    FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\Configuration\\Config.properties");
			    prop.load(ip);
			    System.out.println("driver:" + driver);
			
			
		      }catch (FileNotFoundException e) {
			     e.printStackTrace();
		     }catch (IOException e) {
			     e.printStackTrace();
			
			
		    }
	     }

         public static void lancerApp() {
	
	WebDriverManager.chromedriver().setup();
	
	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equalsIgnoreCase("Chrome")) {
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		System.out.println("driver:" + driver);
	}else if (browserName.equalsIgnoreCase("FireFox")) {
		//driver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		driver.set(new FirefoxDriver());
	}
	
}

public static void goTo() {
	getDriver().get(prop.getProperty("url"));
	//driver.get(prop.getProperty("url"));
}

public void sleep(Duration i) {
	getDriver().manage().timeouts().implicitlyWait(i);
}

}
