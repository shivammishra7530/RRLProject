package StepDefinition;

import org.aspectj.bridge.AbortException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BCE_Agilesh_SearchTRN extends Driver{
	
	
	@Given("the user is on the login page first")
	public void the_user_is_on_the_login_page() {
		driver.get("http://dbankdemo.com/bank/login");
	}

	@When("the user enters their valid user name  and valid password")
	public void the_user_enters_their_valid_user_name_and_valid_password() {
		loginPageAgilesh.ClickUsername();
	   	 loginPageAgilesh.ClickPassword();
	   	
	}

	@When("the user clicks the Sign In button")
	public void the_user_clicks_the_sign_in_button() {
		loginPageAgilesh.ClickSubmit();
	}

	@When("he is able  to click savings button")
	public void he_is_able_to_click_savings_button() {
		clicksavingAgilesh.ClickSavings();
		
	}

	@When("he select a view savings")
	public void he_select_a_view_savings() {
		try {
		    clicksavingAgilesh.ClickviewSavings();
		} catch (AbortException e) {
		    // This block will execute if clicking on "view savings" fails
		    loginPageAgilesh.ClickUsername();
		    loginPageAgilesh.ClickPassword();
		    loginPageAgilesh.ClickSubmit();
		    clicksavingAgilesh.ClickviewSavings();
		}

		
	}

	@When("he search a TRN number")
	public void he_search_a_trn_number() {
		agilsearchTRN.ClicksearchTRN();
	}

	@Then("he get TRN number successfully.")
	public void he_get_trn_number_successfully() {
		
		 
	}
}
