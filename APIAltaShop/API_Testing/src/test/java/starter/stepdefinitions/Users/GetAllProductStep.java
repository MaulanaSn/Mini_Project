package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Users.GetAllProduct;

public class GetAllProductStep {
        @Given("I set url product")
        public void iSetUrlProduct() {
                GetAllProduct.setUrlProduct();
        }
        @When("I request get all of product")
        public void iRequestGetAllOfBook() {
                GetAllProduct.requestGetAllOfProduct();
        }
        @Then("I will get 200")
        public void iWillGet200() {
                GetAllProduct.validateStatus200();
        }
        @And("get all of the infromation of the product")
        public void getAllOfTheInfromationOfTheProduct() {
                GetAllProduct.validateAllOfTheInfromationOfTheProduct();
        }
}
