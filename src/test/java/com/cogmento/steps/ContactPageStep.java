package com.cogmento.steps;

import com.cogmento.pages.ContactPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ContactPageStep {

	private TextContext textContext;

	private ContactPage contactPage;

	public ContactPageStep(TextContext textContext, ContactPage contactPage) {

		this.textContext = textContext;

		this.contactPage = contactPage;
	}

	@Given("user click on contact link")
	public void user_click_on_contact_link() {

		contactPage.clickOnContactLink();
	}

	@Given("user click on create button")
	public void user_click_on_create_button() {

		contactPage.clickOnCreateButton();
	}

	@When("user enter create contact personal details")
	public void user_enter_create_contact_personal_details() {

		contactPage.createContact("Ashish", "Shinde");
	}

	@When("user click on save button")
	public void user_click_on_save_button() {

		contactPage.clickOnSaveButton();
	}

}
