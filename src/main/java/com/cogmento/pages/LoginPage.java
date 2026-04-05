package com.cogmento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUsernameAndPassword(String username, String password) {
		element.sendKeys(this.username, username);

		element.sendKeys(this.password, password);
	}

	public void clickOnLoginButton() {
		element.click(this.loginButton);
	}
}
