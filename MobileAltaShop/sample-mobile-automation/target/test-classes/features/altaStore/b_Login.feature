Feature: Login Account
  As a user
  I want to login
  So I can access my dashboard

  Scenario Outline: Login with email and Password
    Given I am on the login page
    When I input "<email>" email "<password>" password
    And I click Login button
    Then I will get the "<result>"
    Examples:
    |email |password |result        |
    |valid |valid    |success       |
    |random|valid    |failed message|
    |valid |random   |failed message|
    |random|random   |failed message|
    |null  |null     |Must Fill 23  |
    |random|null     |Must Fill 3   |
    |null  |random   |Must Fill 2   |
    |valid |null     |Must Fill 3   |
    |null  |valid    |Must Fill 2   |
