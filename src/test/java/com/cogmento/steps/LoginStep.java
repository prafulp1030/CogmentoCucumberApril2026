package com.cogmento.steps;

import com.cogmento.base.BaseTest;
import com.cogmento.pages.LoginPage;
import com.cogmento.reader.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep {

	private TextContext textContext;
	private BaseTest baseTest;
	private LoginPage loginPage;

	public LoginStep(TextContext textContext, BaseTest baseTest, LoginPage loginPage) {
		this.textContext = textContext;
		this.baseTest = baseTest;
		this.loginPage = loginPage;
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		baseTest.initialization();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {

		loginPage.enterUsernameAndPassword(PropertyReader.getProperty("USERNAME"),
				PropertyReader.getProperty("PASSWORD"));
	}

	@When("user click on login button")
	public void user_click_on_login_button() {

		loginPage.clickOnLoginButton();
	}

}
