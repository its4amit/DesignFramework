package pages;

import org.openqa.selenium.By;

import com.helper.Base;

public class LoginPage extends Base {

	By userName = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");
	By heading = By.xpath("");
	By errorHeading = By.xpath("//h3[@data-test='error]");

	public void enterUserNameAndPass(String uname, String pass) {

		clearAndEnter(waitForExpectedElement(userName), uname);
		clearAndEnter(waitForExpectedElement(password), pass);

	}

	public void clickBtn() {
		clickOnElement(loginBtn);
	}

	public void validateTextHeading() {
		waitForExpectedElement(heading);

	}

	public void errorHeadinDisplayed() {
		waitForExpectedElement(errorHeading).isDisplayed();

	}
}
