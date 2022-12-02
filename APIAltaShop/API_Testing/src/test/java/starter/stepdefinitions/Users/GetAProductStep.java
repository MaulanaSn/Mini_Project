package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Users.GetAProduct;

public class GetAProductStep {

    @Steps
    GetAProduct getAProduct;

    @Given("I set url and valid ID")
    public void iSetUrlAndValidId() {
        getAProduct.setUrlAndValidToken();
    }
    @When("I request get product")
    public void iRequestGetProduct() {
        getAProduct.requestGetAProduct();
    }
    @Given("I set url and invalid ID")
    public void iSetUrlAndInvalidId() {
        getAProduct.setUrlAndInvalidToken();
    }
    @And("get not found message")
    public void getNotFoundMessage() {
        getAProduct.validateNotFoundMessage();
    }
    @And("get a infromation of the product")
    public void getAInfromationOfTheProduct() {
        getAProduct.validateSuccessMessage();
    }
}