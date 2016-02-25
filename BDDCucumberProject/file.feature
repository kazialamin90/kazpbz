Feature: Purchase product from Eshopper24

  Background: 
    Given I open Browser and go to Eshopper24

  Scenario: 
    When Click on menlink from the header
    And Select shoe category
    Then I should be redirected to shoepage

  Scenario: 
    When Click on womenlink from the header
    And Select watches category
    Then I should be redirected to watchespage

  Scenario Outline: 
    When Search for products "<searchText>"
    And Click on search button
    Then I should get expected result

    Examples: 
      | searchText |
      | pant       |
      | shirt      |
      | book       |
