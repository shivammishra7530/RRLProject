package StepDefinition;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.log4j.Level;
import PageFactory.ClickTransferBetweenAccount;
import PageFactory.LoginPage;
import PageFactory.TransferBetweenAccount;
import PageFactory.VerifyMessageForTransferBwAccount;
import PageFactory.VerifyWelcomeMessage;

public class Driver extends Tools{
	protected static LoginPage loginPage;
	
	protected static ClickTransferBetweenAccount clickTransferBetweenAccount;
	protected static TransferBetweenAccount transferBetweenAccount;
	protected static VerifyMessageForTransferBwAccount verifyMessageForTransferBwAccount;
	protected static VerifyWelcomeMessage verifyWelcomeMessage;
	public static  Logger logger ;
	public static void init() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");
		
		loginPage = new LoginPage(driver);
		clickTransferBetweenAccount = new ClickTransferBetweenAccount(driver);
		transferBetweenAccount = new TransferBetweenAccount(driver);
		verifyMessageForTransferBwAccount = new VerifyMessageForTransferBwAccount(driver);
		verifyWelcomeMessage = new VerifyWelcomeMessage(driver);
		logger = Logger.getLogger("Transfer");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
		
		
	}
	
	
	
	
}
