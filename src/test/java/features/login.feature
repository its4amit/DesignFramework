Feature: Login Functionality

#Background: BAT application launch

#Given user launch site url


@regression
Scenario: verify login with valid username and password 
When user enter username "standard_user" and password "secret_sauce"
And user clicks on login button
Then validate successful login with heading "Products"


Scenario: verify login with invalid username and password 
When user enter username "test" and password "test"
And user clicks on login button
Then validate error message displayed


Scenario: verify login with valid username and invalid password 
When user enter username "standard_user" and password "test"
And user clicks on login button
Then validate error message displayed


Scenario: verify login with invalid username and valid password 
When user enter username "test" and password "secret_sauce"
And user clicks on login button
Then validate error message displayed


Scenario: verify login with blank username and blank password 
And user clicks on login button
Then validate error message displayed



