package StepDefinition;



import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features = {"Features//Login.feature", "Features//Search.feature"},
				features = "Features//TransferMoneyBwAccounts.feature",
		glue = "StepDefinition"
		
		
		)

@Listeners(Utilities.TestListener.class)

public class TestRunner extends AbstractTestNGCucumberTests{

}
