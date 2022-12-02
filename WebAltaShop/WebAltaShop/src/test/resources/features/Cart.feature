Feature: Cart To Order
  As a User
  I want add product to order
  So I can see that information

  Scenario: Add one product
    Given I am on the Alta Store page
    When I click buy button in one product
    And I click cart icon
    Then I will see the product before

  Scenario: Add two product
    Given I am on the Alta Store page
    When I click buy button in two product
    And I click cart icon
    Then I will see the two product before

  Scenario: Add three product
    Given I am on the Alta Store page
    When I click buy button in three product
    And I click cart icon
    Then I will see the three product before

  Scenario: Add four product
    Given I am on the Alta Store page
    When I click buy button in four product
    And I click cart icon
    Then I will see the four product before

  Scenario: Add five product
    Given I am on the Alta Store page
    When I click buy button in five product
    And I click cart icon
    Then I will see the five product before