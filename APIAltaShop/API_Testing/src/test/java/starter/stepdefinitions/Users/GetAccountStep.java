package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import net.thucydides.core.annotations.Steps;
import starter.Users.GetAccount;

public class GetAccountStep {

    @Steps
    GetAccount getAccount;
    @Given("I set url and valid token")
    public void iSetUrlAndValidToken() {
        getAccount.setUrlAndValidToken();
    }
    @Given("I set url and invalid token")
    public void iSetUrlAndInvalidToken() {
        getAccount.setUrlAndInvalidToken();
    }
    @Given("I set url and null token")
    public void iSetUrlAndNullToken() {
        getAccount.setUrlAndNullToken();
    }
    @SneakyThrows
    @When("^I request get account$")
    public void iRequestGetAccount() {
        getAccount.requestGetAccount();
    }
    @And("^get information$")
    public void getInformation() throws Exception{
        getAccount.validationOfToken();
    }
    @And("get invalid message")
    public void getInvalidMessage() {
        getAccount.validationOfInvalid();
    }
    @And("^get Error Unauthorized message$")
    public void getErrorUnauthorizedMessage() {
        getAccount.validationOfUnauthor();
    }
    @When("I request with invalid token")
    public void iRequestWithInvalidToken() {
        getAccount.requestWithInvalidToken();
    }
    @When("I request with null token")
    public void iRequestWithNullToken() {
        getAccount.requestWithNullToken();
    }
}
