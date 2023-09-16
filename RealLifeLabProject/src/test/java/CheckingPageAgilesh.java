 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingPageAgilesh {
	 
	
	        @FindBy  (id  ="checking-menu")
	    	private WebElement checkingmenu;
	        
	        @FindBy  ( linkText ="View Checking")
	    	private WebElement viewcheckingmenu;
	        
	      
	    	public CheckingPageAgilesh(WebDriver driver) {
	    		PageFactory.initElements(driver, this);
	    	}
	    		
	    		public void navigateToChecking() {
	    			checkingmenu.click();
	    			viewcheckingmenu.click();
	    		}
	    		
	    	
		
	    	
	    	
	        
	    }