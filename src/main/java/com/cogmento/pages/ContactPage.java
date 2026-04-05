package com.cogmento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement savebutton;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnContactLink() {
		element.click(this.contactLink);
	}

	public void clickOnCreateButton() {
		element.click(this.createButton);
	}

	public void createContact(String firstName, String lastName) {
		element.sendKeys(this.firstName, firstName);
		element.sendKeys(this.lastname, lastName);
	}

	public void clickOnSaveButton() {
		element.click(this.savebutton);
	}

}
