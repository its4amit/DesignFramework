package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

	LoginPage login = new LoginPage();

//	@Given("user launch site url")
//	public void user_launch_url_site() {
//		login.launchApllication();	
//	}

	@When("user enter username {string} and password {string}")
	public void enter_Username_Password(String username, String password) {
		login.enterUserNameAndPass(username, password);
	}

	@And("user clicks on login button")
	public void user_enter_login_button() {
		login.clickBtn();

	}

	@Then("validate successful login")
	public void validate_successful_login() {
		login.validateTextHeading();

	}

	@Then("validate error message displayed")
	public void validateErrorMessageDisplayed() {
		login.errorHeadinDisplayed();

	}

}