Feature: to test Orange demo

  Scenario Outline: to test with 2data login
    Given user open HRM website
    When user enter valid <username> and <password>
    And user click on login
    Then enter main page

    Examples: 
      | username | password |
      | admin    | Admin123 |
      | raks     | as3123   |
    