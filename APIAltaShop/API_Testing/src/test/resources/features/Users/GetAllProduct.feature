Feature: Get All Product
  As a user
  I want to get all product
  So I can get information all of the product

  Scenario: Get all product
    Given I set url product
    When I request get all of product
    Then I will get 200
    And get all of the infromation of the product