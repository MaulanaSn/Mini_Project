Feature: Login Account
  As a user
  I want to login my account
  So i can check access next feature

  Scenario: Login with valid email and password
    Given I set url
    And valid email and password
    When I request post
    Then I will get 200
    And get true message

  Scenario: Login with valid email and invalid password
    Given I set url
    And valid email and invalid password
    When I request post vi
    Then I will get 400
    And get message failed

  Scenario: Login with invalid email and valid password
    Given I set url
    And invalid email and valid password
    When I request post iv
    Then I will get 400
    And get message not found

  Scenario: Login Account with invalid email and password
    Given I set url
    And invalid email and password
    When I request post ii
    Then I will get 400
    And get message failed
