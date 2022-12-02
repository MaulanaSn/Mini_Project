Feature: Purchase the Order
  As a user
  I want to purchase the order
  So I can get transaction

  Scenario: Purchase as a user condition (one product)
    Given I have login on Alta Store
    When I click buy button in one product
    And I click cart icon
    And I click purchase
    Then I will see the history transaction

  Scenario: Purchase as a guess condition (one product)
    Given I dont have login on Alta Store
    When I click buy button in one product
    And I click cart icon
    And I click purchase
    Then I will go to login page

  Scenario: Purchase as a user condition (two product)
    Given I have login on Alta Store
    When I click buy button in two product
    And I click cart icon
    And I click purchase
    Then I will see the history transaction

  Scenario: Purchase as a guess condition (two product)
    Given I dont have login on Alta Store
    When I click buy button in two product
    And I click cart icon
    And I click purchase
    Then I will go to login page

  Scenario: Purchase as a user condition (three product)
    Given I have login on Alta Store
    When I click buy button in three product
    And I click cart icon
    And I click purchase
    Then I will see the history transaction

  Scenario: Purchase as a guess condition (three product)
    Given I dont have login on Alta Store
    When I click buy button in three product
    And I click cart icon
    And I click purchase
    Then I will go to login page

  Scenario: Purchase as a user condition (four product)
    Given I have login on Alta Store
    When I click buy button in four product
    And I click cart icon
    And I click purchase
    Then I will see the history transaction

  Scenario: Purchase as a guess condition (four product)
    Given I dont have login on Alta Store
    When I click buy button in four product
    And I click cart icon
    And I click purchase
    Then I will go to login page

  Scenario: Purchase as a user condition (five product)
    Given I have login on Alta Store
    When I click buy button in five product
    And I click cart icon
    And I click purchase
    Then I will see the history transaction

  Scenario: Purchase as a guess condition (five product)
    Given I dont have login on Alta Store
    When I click buy button in five product
    And I click cart icon
    And I click purchase
    Then I will go to login page