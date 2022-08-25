package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageConnexion extends Base{
	
	 
	
    public static By boutonConnexion = By.id("dropdown-account");
   public static By boutonCreerCompte = By.id("redirectCreateAccount");
	 
    public static By ToutAccept = By.id("onetrust-accept-btn-handler");
    
    public WebElement ToutAccepte = driver.findElement(ToutAccept);
	 public void clic_Connexion() {
		  ToutAccepte.click();
		 boutonConnexion.click();
		 
	 }
	 
	 
	 
	 
     public void clic_Creer_Compte() {
    	  boutonCreerCompte.click();
     }
}
