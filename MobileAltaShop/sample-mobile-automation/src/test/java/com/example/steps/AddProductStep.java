package com.example.steps;

import com.example.app.pages.AddProductToCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductStep {
    AddProductToCartPage addProductToCartPage = new AddProductToCartPage();
    @When("I click buy on the {string} product")
    public void iClickBuyOnTheProduct(String arg0) {
        addProductToCartPage.buyProduct(arg0);
    }

    @Then("I will see the {string} number on the cart")
    public void iWillSeeTheNumberOnTheCart(String arg0) {
        addProductToCartPage.numberCart(arg0);
    }
}
