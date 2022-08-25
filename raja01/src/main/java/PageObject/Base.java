package PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public void lauch() {   
		
		try {
			 prop = new Properties();
			 System.out.println("super constructer");
			 FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\Configuration\\Confi.properties");
			 prop.load(ip);
			 System.out.println("driver:" + driver);
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
			
		}
	 }
	
	public static void lancer() {
		
		WebDriverManager.chromedriver().setup();
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.contains("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("driver:" + driver);
		}else if (browserName.contains("FireFox")) {
			driver = new FirefoxDriver();
		}
		
	}

}
