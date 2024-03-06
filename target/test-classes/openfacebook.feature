Feature: As a user, I want to open the facebook page so that i can post a picture

  Scenario: To open the facebook page
    Given The browser is setup
    And Go to facebook page
    Then Validate the facebook page
    Then Close the browser