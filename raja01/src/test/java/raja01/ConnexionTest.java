package raja01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObject.Base;
//import PageObject.PageConnexion;

public class ConnexionTest extends Base {
	
	 @FindBy(id= "dropdown-account")
	  WebElement boutonConnexion;
	 @FindBy(id="redirectCreateAccount")
	 WebElement boutonCreerCompte;
	 @FindBy(id= "onetrust-accept-btn-handler")
	 WebElement ToutAccept;
	
	// PageConnexion pageConnexion = new PageConnexion();
	


	 
	 
	 public void clic_Connexion() {
		  ToutAccept.click();
		  boutonConnexion.click();
		 
	 }
	 public void clic_Creer_Compte() {
   	  boutonCreerCompte.click();
    }
	 public ConnexionTest() {
		    super();//In case you want to pass the driver instance to super class
		    PageFactory.initElements(driver,this);
		}
	 
	 @Test
	 public void  connexion() {
		 //PageConnexion pageConnexion2 = new PageConnexion();
		 lauch();
		 lancer();
		
		 driver.get("https://www.raja.fr/");
		 clic_Connexion();
		 clic_Creer_Compte();
	     
	 }
}
