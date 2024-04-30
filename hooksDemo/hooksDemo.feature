Feature: check login functionality

  Scenario: valid credentials
    Given user is on login page
    When user enter valid username and password
    And user click on login page
    Then user is navigated to homepage

  Scenario: valid credentials
    Given user is on login page
    When user enter valid username and password
    And user click on login page
    Then user is navigated to homepage
