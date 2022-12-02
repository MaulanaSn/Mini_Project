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
      |null  |null  |null    |Must Fill All  |
      |null  |null  |random  |Must Fill 12   |
      |null  |random|null    |Must Fill 13   |
      |random|null  |null    |Must Fill 23   |
      |null  |null  |valid   |Must Fill 12   |
      |null  |valid |null    |Must Fill 13   |
      |valid |null  |null    |Must Fill 23   |
      |null  |valid |valid   |Must Fill 1    |
      |random|random|null    |Must Fill 3    |
      |null  |valid |valid   |Must Fill 1    |
      |valid |valid |null    |Must Fill 3    |
      |valid |valid |valid   |failed regist  |
      |random|random|random  |success        |
      |valid |null  |random  |Must Fill 2    |
      |valid |random|null    |Must Fill 3    |
      |random|valid |null    |Must Fill 3    |
      |random|null  |valid   |Must Fill 2    |
      |valid |valid |random  |failed regist  |
      |random|random|valid   |success        |
      |valid |random|valid   |success        |
      |random|valid |random  |failed regist  |
      |random|valid |valid   |failed regist  |
      |valid |random|valid   |success        |
      |valid |valid |random  |failed regist  |
      |valid |random|random  |success        |
      |random|valid |random  |failed regist  |
      |random|random|valid   |success        |
