package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;

public class CartStep {
        @Steps
        CartPage cartToOrder;

        @Given("^I am on the Alta Store page$")
        public void iAmOnTheAltaStorePage(){
            cartToOrder.altaStoreUrl();
        }
        @When("^I click buy button in one product$")
        public void iClickBuyButtonInOneProduct(){
            cartToOrder.clickBuyButton1();
        }
         @When("I click buy button in two product")
        public void iClickBuyButtonInTwoProduct() {
            cartToOrder.clickBuyButton1();
            cartToOrder.clickBuyButton2();
        }
    @When("I click buy button in three product")
    public void iClickBuyButtonInThreeProduct() {
        cartToOrder.clickBuyButton1();
        cartToOrder.clickBuyButton2();
        cartToOrder.clickBuyButton3();
    }
    @When("I click buy button in four product")
    public void iClickBuyButtonInFourProduct() {
        cartToOrder.clickBuyButton1();
        cartToOrder.clickBuyButton2();
        cartToOrder.clickBuyButton3();
        cartToOrder.clickBuyButton4();
    }
    @When("I click buy button in five product")
    public void iClickBuyButtonInFiveProduct() {
        cartToOrder.clickBuyButton1();
        cartToOrder.clickBuyButton2();
        cartToOrder.clickBuyButton3();
        cartToOrder.clickBuyButton4();
        cartToOrder.clickBuyButton5();
    }


        @And("I click cart icon")
        public void iClickCartIcon(){
            cartToOrder.clickCartIcon();
        }
        @Then("^I will see the product before$")
        public void iWillSeeTheProductBefore(){
            cartToOrder.displayInfo();
        }
        @Then("I will see the two product before")
        public void iWillSeeTheTwoProductBefore() {
            cartToOrder.displayTwoInfo();
            cartToOrder.displayInfo();
         }
    @Then("I will see the three product before")
    public void iWillSeeTheThreeProductBefore() {
        cartToOrder.displayTwoInfo();
        cartToOrder.displayInfo();
        cartToOrder.displayThreeInfo();
    }
    @Then("I will see the four product before")
    public void iWillSeeTheFourProductBefore() {
        cartToOrder.displayTwoInfo();
        cartToOrder.displayInfo();
        cartToOrder.displayThreeInfo();
        cartToOrder.displayFourInfo();
    }
    @Then("I will see the five product before")
    public void iWillSeeTheFiveProductBefore() {
        cartToOrder.displayTwoInfo();
        cartToOrder.displayInfo();
        cartToOrder.displayThreeInfo();
        cartToOrder.displayFourInfo();
        cartToOrder.displayFiveInfo();
    }

}
