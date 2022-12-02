Feature: Get All Order
  As a user
  I want to see all order
  So I can get information of the product

  Scenario: Get All Order with valid Token
    Given I set url order and valid token
    When I request order with valid token
    Then I will get 200
    And get information

  Scenario: Get All Order with invalid Token
    Given I set url order and invalid token
    When I request order with invalid token
    Then I will get 401
    And get invalid message

  Scenario: Get All Order with null Token
    Given I set url order and null token
    When I request order with null token
    Then I will get 401
    And get Error Unauthorized message
