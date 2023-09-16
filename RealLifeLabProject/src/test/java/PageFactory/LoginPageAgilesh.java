package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAgilesh {
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "submit")
	private WebElement submit;
	
	public LoginPageAgilesh(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickUsername() {
		username.sendKeys("abcd123@gmail.com");
	}
	
	public void ClickPassword() {
		password.sendKeys("12345Aa@");
	}
	
	public void ClickSubmit() {
		submit.click();
	}

}