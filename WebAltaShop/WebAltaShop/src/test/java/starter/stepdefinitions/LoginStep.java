package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.loginUrl();
        loginPage.scrollDown();
    }
    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputEmail("zighit7@gmail.com");
    }
    @When("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("Dela@gmail.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("Maulana ");
    }
    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("test123");
    }
    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get record not found message")
    public void iWillGetRecordNotFoundMessage() {
        loginPage.recordNotFoundMessageDisplayed();
    }

    @Then("I will get invalid message")
    public void iWillGetInvalidMessage() {
        loginPage.invalidMessageDisplayed();
    }
    @Then("I will see product in Alta Store")
    public void iWillSeeProductInAltaStore() {
        loginPage.headerDisplayed();
    }
}
