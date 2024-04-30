Feature: user login

  Scenario: successful login
    Given user is on nocommerce login page
    When user enter (username: "rai06@gmail.com", password: "Jwc12345")
    And user click on login button
    Then user to be directed to Myaccount page
    And user should see welcome message
