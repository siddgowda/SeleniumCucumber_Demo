Feature: As a user, I want to logout of the facebook page so that my account is secure

  Scenario: To logout of facebook page
    Given The browser is setup
    And Go to facebook page and logout
    Then Validate the logout
    Then Close the browser