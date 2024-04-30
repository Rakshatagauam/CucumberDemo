Feature: to test OrangeHRM demo

  Scenario: to test with valid credentials
    Given user open website
    When user enter valid (Username: "admin", Password: "admin123")
    And user click on login
    Then enter homepage
