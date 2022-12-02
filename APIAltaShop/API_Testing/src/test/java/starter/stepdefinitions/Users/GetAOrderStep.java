package starter.stepdefinitions.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Users.GetAOrder;

public class GetAOrderStep {

    @Steps
    GetAOrder getAOrder;
    @Given("I set url order with id and valid token")
    public void iSetUrlOrderWithIdAndValidToken() {
        getAOrder.setUrlOrderIdAndValidToken();
    }

    @When("I request order with id and valid token")
    public void iRequestOrderWithIdAndValidToken() {
        getAOrder.requestOrderIdValidToken();
    }

    @Given("I set url order with id and invalid token")
    public void iSetUrlOrderWithIdAndInvalidToken() {
        getAOrder.setUrlOrderIdAndInvalidToken();
    }

    @When("I request order with id and invalid token")
    public void iRequestOrderWithIdAndInvalidToken() {
        getAOrder.requestOrderIdInvalidToken();
    }

    @Given("I set url order with id and null token")
    public void iSetUrlOrderWithIdAndNullToken() {
        getAOrder.setUrlOrderIdAndNullToken();
    }

    @When("I request order with id and null token")
    public void iRequestOrderWithIdAndNullToken() {
        getAOrder.requestOrderIdNullToken();
    }
}
