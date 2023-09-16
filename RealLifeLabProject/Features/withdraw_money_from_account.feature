Feature: Withdraw money from an account
  Scenario: Login with valid credentials
    Given the User is on the home page
    When the User clicks on savings  and create account  
    And the User verify-"Successfully created new Savings account named John"
    And the User clicks on withdraw and withdrawls the money
    Then the User should Verify-"Interest Rate: 1.85%"
    
   