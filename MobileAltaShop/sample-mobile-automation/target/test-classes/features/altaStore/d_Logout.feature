Feature: Logout Account
  As a user
  I want to logout
  So I can logout my account

  Scenario: Logout with valid email and Password
    Given I have login on Alta Store
    When I click logout icon
    Then I will go to login page