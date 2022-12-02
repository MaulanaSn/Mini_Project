Feature: Get Account with Token
  As a user
  I want to Get account with Token
  So I can get information of my account

  Scenario: Get Account with valid token
    Given I set url and valid token
    When I request get account
    Then I will get 200
    And get information

  Scenario: Get Account with invalid token
    Given I set url and invalid token
    When I request with invalid token
    Then I will get 401
    And get invalid message

  Scenario: Get Account with null token
    Given I set url and null token
    When I request with null token
    Then I will get 401
    And get Error Unauthorized message