Feature: Advance search ebay page

@P23
Scenario: Ebay logo on advance search

Given I am ebay advnace search page
When I click on ebay logo
Then I am navigated to ebay home page


Scenario Outline: Home page link
Given i am on ebay page
When I click on '<link>'
Then I validate that page navigate to '<url>' and tittle contains '<tittle>'

Examples: 
|link|url|tittle|