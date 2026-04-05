Feature: Test Cogmento Application

  Background:
    Given user is on login page
    When user enter valid username and password
    And user click on login button

  Scenario: Create new contact in Contact page
    Given user click on contact link
    And user click on create button
    When user enter create contact personal details
    And user click on save button
