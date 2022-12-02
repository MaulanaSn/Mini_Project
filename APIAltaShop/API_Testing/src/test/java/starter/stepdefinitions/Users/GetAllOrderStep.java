package starter.stepdefinitions.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Users.GetAllOrder;

public class GetAllOrderStep {

    @Steps
    GetAllOrder getAllOrder;

    @Given("I set url order and valid token")
    public void iSetUrlOrderAndValidToken() {
        getAllOrder.setUrlOrderAndValidToken();
    }
    @When("I request order with valid token")
    public void iRequestOrderWithValidToken() {
        getAllOrder.requestOrderValidToken();
    }
    @Given("I set url order and invalid token")
    public void iSetUrlOrderAndInvalidToken() {
        getAllOrder.setUrlOrderAndInvalidToken();
    }
    @When("I request order with invalid token")
    public void iRequestOrderWithInvalidToken() {
        getAllOrder.requestOrderInvalidToken();
    }
    @Given("I set url order and null token")
    public void iSetUrlOrderAndNullToken() {
        getAllOrder.setUrlOrderAndNullToken();
    }
    @When("I request order with null token")
    public void iRequestOrderWithNullToken() {
        getAllOrder.requestOrderNullToken();
    }
}
