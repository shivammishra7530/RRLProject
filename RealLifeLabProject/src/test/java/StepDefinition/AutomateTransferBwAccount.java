package StepDefinition;

import java.io.IOException;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import Utilities.ExcelRead;

public class AutomateTransferBwAccount extends Driver {
	
	
	@Given("a user is on the Log In Page of the Website")
	public void a_user_is_on_the_log_in_page_of_the_website() {
	   
	}

	@When("the user enters all the correct credentials and clicks on SIGN IN")
	public void the_user_enters_all_the_correct_credentials_and_clicks_on_sign_in() {
		loginPage.ClickUsername();
        loginPage.ClickPassword();
        loginPage.ClickSubmit();
	}

	@When("the login is successful, and a welcome message is displayed")
	public void the_login_is_successful_and_a_welcome_message_is_displayed() {
		String expectedErrMsg = "Welcome Selena";
       String actualErrMsg = verifyWelcomeMessage.DoVerifyWelcomeMessage();
        Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}

	@When("the User clicks on Transfer Between Accounts")
	public void the_user_clicks_on_transfer_between_accounts() throws InterruptedException {
		Thread.sleep(2000);
		clickTransferBetweenAccount.ClickTransferBetweenAccounts();
		/*loginPage.ClickUsername();
        loginPage.ClickPassword();
        loginPage.ClickSubmit();
        clickTransferBetweenAccount.ClickTransferBetweenAccounts();*/
	}

	@When("they select the From Account from the Dropdown")
	public void they_select_the_from_account_from_the_dropdown() throws IOException, InterruptedException {
		 String[][] data = ExcelRead.getData("C:\\Users\\hp\\Desktop\\TransferMoneyRRL.xlsx", "Sheet1");
		 transferBetweenAccount.ClickSelectAccountType();
         transferBetweenAccount.ClickSelectAccountToType();
	        for (int i = 0; i < data.length; i++) {
	            try {
	            	
	                String amount = data[i][0];
	                transferBetweenAccount.EnterAmount(amount);
	                
	            } catch (Exception e) {
	                e.printStackTrace(); 
	            }
	            
                transferBetweenAccount.ClickSubmit();
                Thread.sleep(2000);
	        }
	}

	@When("they select the To Account from the Dropdown")
	public void they_select_the_to_account_from_the_dropdown() {
		
		logger.info("Payload created");
	}

	@When("they enter the amount")
	public void they_enter_the_amount() {
		logger.info("Payload created");
	}

	@When("they click on the submit button")
	public void they_click_on_the_submit_button() {
		logger.info("Payload created");
	}

	@Then("they verify the message of successful transfer")
	public void they_verify_the_message_of_successful_transfer() {
		 String expectedErrMsg = "Account Number: 486171115";
	        String actualErrMsg = verifyMessageForTransferBwAccount.DoVerifyMessageForTransferBwAccount();
	        Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
	
}
