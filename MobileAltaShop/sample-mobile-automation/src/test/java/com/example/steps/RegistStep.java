package com.example.steps;

import com.example.app.pages.RegistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistStep {
    RegistPage registPage = new RegistPage();

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage(){
        registPage.clickLoginIcon();
        registPage.clickRegistText();
    }
    @When("I input {string} nama lengkap {string} email and {string} password")
    public void iInputNamaLengkapAndPassword(String arg0, String arg1, String arg2) {
        registPage.inputNameRegist(arg0);
        registPage.inputEmailRegist(arg1);
        registPage.inputPasswordRegist(arg2);
    }
    @And("I click register button")
    public void iClickRegisterButton() {
        registPage.clickRegistBtn();
    }
    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        if (result.equals("Must Fill All")) {
            registPage.errMsgEmailDisplayed();
            registPage.errMsgNameDisplayed();
            registPage.errMsgPwdDisplayed();
        } else if (result.equals("Must Fill 12")) {
            registPage.errMsgNameDisplayed();
            registPage.errMsgEmailDisplayed();
        } else if (result.equals("Must Fill 13")){
            registPage.errMsgNameDisplayed();
            registPage.errMsgPwdDisplayed();
        } else if (result.equals("Must Fill 23")){
            registPage.errMsgEmailDisplayed();
            registPage.errMsgPwdDisplayed();
        } else if (result.equals("Must Fill 1")){
            registPage.errMsgNameDisplayed();
        } else if (result.equals("Must Fill 2")){
            registPage.errMsgEmailDisplayed();
        } else if (result.equals("Must Fill 3")){
            registPage.errMsgPwdDisplayed();
        } else if (result.equals("failed regist")){
            registPage.errMsgAllRegistDisplayed();
        } else if (result.equals("failed login")){
            registPage.errMsgAllLoginDisplayed();
        } else if (result.equals("success")){
            registPage.success();
        }
    }

}
