Feature: Login Account
  As a user
  I want to login
  So I can access my dashboard

  Scenario: Login with valid email and Password
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click Login button
    Then I will see product in Alta Store

  Scenario: Login with valid email and invalid password
    Given I am on the login page
    When I input valid email
    And I input invalid password
    And I click Login button
    Then I will get invalid message

  Scenario: Login with invalid email and invalid password
    Given I am on the login page
    When I input invalid email
    And I input invalid password
    And I click Login button
    Then I will get record not found message

  Scenario: Login with invalid email and valid password
    Given I am on the login page
    When I input invalid email
    And I input valid password
    And I click Login button
    Then I will get record not found message