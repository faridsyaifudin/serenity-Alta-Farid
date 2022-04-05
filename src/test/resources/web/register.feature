Feature:  Register page

  Scenario: Success Register
    Given  user is on registration page
    And    user input email valid
    And    user input password valid
    And    user input address valid
    When   user click register button
    Then   user should be redirected to dashboard homepage

  Scenario: Failed Register
    Given  user is on registration page
    And    user input email invalid
    And    user input password invalid
    And    user input address invalid
    When   user click register button
    Then   user should be able to see warning message or Register button is disabled

  Scenario: Register using Google Account
    Given  user is on registration page
    When   user click register with google account
    Then   user should be redirected to Google page
  Scenario: Register using Facebook Account
    Given  user is on registration page
    When   user is click register with facebook account
    Then   user should be redirected to facebook page