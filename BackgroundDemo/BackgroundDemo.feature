Feature: check homepage functionality

  Scenario: check logout link
    Given username is also logged in ok
    When user click on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is available
    Given username is also logged in
    When user click on dashboard link
    Then quick launch toolbar is displayed
