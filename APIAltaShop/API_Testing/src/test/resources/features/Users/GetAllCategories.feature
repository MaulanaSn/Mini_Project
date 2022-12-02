Feature: Get All Categories
  As a user
  I want to know all categories
  so i can get information about all categories

  Scenario: Get All Categories
    Given I set url categories
    When I request get categories
    Then I will get 200
    And get information