package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterStep {
    @Steps
    RegisterPage registPage;
    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        registPage.openUrl();
    }
    @When("I input {string} nama lengkap {string} email and {string} password")
    public void iInputNamaLengkapAndPassword(String arg0, String arg1, String arg2) {
        registPage.inputName(arg0);
        registPage.inputEmail(arg1);
        registPage.inputPassword(arg2);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registPage.clickRegistBtn();
    }

    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        if (result.equals("i can't regist")) {
            registPage.errorMessageDisplayed();
        } else if (result.equals("i can regist")) {
            registPage.validMessageDisplayed();
        }
    }
}
