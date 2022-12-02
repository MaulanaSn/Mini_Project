Feature: Get product By ID
  As a user
  I want to get product by ID
  So I can know the product information

  Scenario: Get product with valid ID
    Given I set url and valid ID
    When I request get product
    Then I will get 200
    And get a infromation of the product

  Scenario: Get a Book with invalid ID
    Given I set url and invalid ID
    When I request get product
    Then I will get 404
    And get not found message