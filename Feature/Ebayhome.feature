Feature: Ebay home page scenarios

  @P1
  Scenario: Advanced search link
    Given I click on ebay page
    When I click on advance link
    Then I navigate to advance search page

  @P2
  Scenario: search item count
    Given I click on ebay page
    When I search for Iphone 11
    Then I validate atleast 1000 search item process
