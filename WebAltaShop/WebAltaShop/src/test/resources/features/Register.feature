Feature: Register Account
  As a guest
  I want to register account
  So I can login

  Scenario Outline: Regist with nama lengkap, email, and password
    Given I am on the register page
    When I input "<name>" nama lengkap "<email>" email and "<password>" password
    And I click register button
    Then I will get the "<result>"
    Examples:
      | name | email|password| result        |
      |null  |null  |null    |i can't regist |
      |null  |null  |random  |i can't regist |
      |null  |random|null    |i can't regist |
      |random|null  |null    |i can't regist |
      |null  |null  |valid   |i can't regist |
      |null  |valid |null    |i can't regist |
      |valid |null  |null    |i can't regist |
      |null  |valid |valid   |i can't regist |
      |random|random|null    |i can't regist |
      |null  |valid |valid   |i can't regist |
      |valid |valid |null    |i can't regist |
      |valid |valid |valid   |i can't regist |
      |random|random|random  |i can regist   |
      |valid |null  |random  |i can't regist |
      |valid |random|null    |i can't regist |
      |random|valid |null    |i can't regist |
      |random|null  |valid   |i can't regist |
      |valid |valid |random  |i can't regist |
      |random|random|valid   |i can regist   |
      |valid |random|valid   |i can regist   |
      |random|valid |random  |i can't regist |
      |random|valid |valid   |i can't regist |
      |valid |random|valid   |i can regist   |
      |valid |valid |random  |i can't regist |
      |valid |random|random  |i can regist   |
      |random|valid |random  |i can't regist |
      |random|random|valid   |i can regist   |
