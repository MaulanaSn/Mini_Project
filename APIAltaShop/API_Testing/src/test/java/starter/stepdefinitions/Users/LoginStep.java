package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Users.Login;

public class LoginStep {
    @Given("^I set url$")
    public void iSetUrl(){
        Login.setUrlAuth();
    }

    @And("^valid email and password$")
    public void validEmailAndPassword(){
        Login.validEmailAndPassword();
    }
    @And("valid email and invalid password")
    public void validEmailAndInvalidPassword() {
        Login.validEmailAndInvalidPassword();
    }
    @And("invalid email and valid password")
    public void invalidEmailAndValidPassword() {
        Login.InvalidEmailAndValidPassword();
    }
    @And("invalid email and password")
    public void invalidEmailAndPassword() {
        Login.invalidEmailAndPassword();
    }

    @When("^I request post$")
    public void requestPost(){
        Login.requestPost();
    }
    @When("I request post iv")
    public void iRequestPostIv() {
        Login.requestPostIv();
    }
    @When("I request post vi")
    public void iRequestPostVi() {
        Login.requestPostVi();
    }
    @When("I request post ii")
    public void iRequestPostIi() {
        Login.requestPostIi();
    }
    @Then("^I will get 400$")
    public void iWillGet400 (){
        Login.validateStatus400();
    }

    @And("^get true message$")
    public void getTrueMessage(){
        Login.validationMessage200();
    }
    @Then("^I will get 404$")
    public void iWillGet404(){
        Login.validateStatus404();
    }
    @And("^get message not found$")
    public void getMessageNotFound(){
        Login.validationOfNotFound();
    }
    @And("get message failed")
    public void getMessageFailed() {
        Login.validationOfFailed();
    }

}
