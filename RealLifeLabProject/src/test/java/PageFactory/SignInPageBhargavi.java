package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageBhargavi {

	@FindBy(id="username")
	private WebElement usernameTextbox;
	@FindBy(id="password")
	private WebElement passwordTextBox;
	@FindBy(id="submit")
	private WebElement signIn;
	public SignInPageBhargavi(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String username) {
		
		usernameTextbox.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickSIgnInBtn() {
		signIn.click();
	}

	
}
