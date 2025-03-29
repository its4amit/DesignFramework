Feature: Payment Functionality

Scenario: Order creation successfully
When user enter username "standard_user" and password "secret_sauce"
And user clicks on login button
And user clicks the add to cart button 
And verify cart count "1"	
And user click on mini cart
And user navigate to checkout page 
And user click on checkout button
And user navigate to checkout overview page 
And user enter the information
And user click on continue button
