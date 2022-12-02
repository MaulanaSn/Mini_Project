Feature: Add Product To Cart
  As a user
  I want to buy product
  So i can add product to cart

  Scenario Outline: Add one product
    Given I have login on Alta Store
    When I click buy on the "<product>" product
    Then I will see the "<number>" number on the cart
    Examples:
      |product|number|
      |1      |1     |
      |2      |2     |
      |3      |3     |
      |4      |4     |
      |5      |5     |
