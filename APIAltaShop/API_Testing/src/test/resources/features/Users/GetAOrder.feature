Feature: Get A Order with Token
  As a user
  I want to get order with Token
  So I can see the product

  Scenario: Get Order with valid Token
    Given I set url order with id and valid token
    When I request order with id and valid token
    Then I will get 200
    And get information

  Scenario: Get Order with invalid ID
    Given I set url order with id and invalid token
    When I request order with id and invalid token
    Then I will get 401
    And get invalid message

  Scenario: Get Order with null token
    Given I set url order with id and null token
    When I request order with id and null token
    Then I will get 401
    And get Error Unauthorized message