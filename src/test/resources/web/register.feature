@register @staging @Alta-QE3
Feature:  Register page

  Background:
    Given user is on registration page

  @positive
  Scenario: Success Register
    Given  user is on registration page
    And    user input email data
    And    user input password data
    And    user input address data
    When   user click register button
    Then   user should be redirected to dashboard homepage

  @negative
  Scenario: Failed Register
    Given  user is on registration page
    And    user input email data
    And    user input password data
    And    user input address data
    When   user click register button
    Then   user should be able to see warning message or Register button is disabled

  @positive
  Scenario: Register using Google Account
    Given  user is on registration page
    When   user click register with google account
    Then   user should be redirected to Google page

  @positive
  Scenario: Register using Facebook Account
    Given  user is on registration page
    When   user is click register with facebook account
    Then   user should be redirected to facebook page