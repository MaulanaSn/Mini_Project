package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;
import starter.pages.RegisterPage;

public class LogoutStep {
    @Steps
    LogoutPage logoutPage;
    @Steps
    LoginPage loginPage;
    @Steps
    RegisterPage registPage;
    @Given("I have login on Alta Store")
    public void iHaveLoginOnAltaStore() {
        loginPage.loginUrl();
        loginPage.inputEmail("zighit7@gmail.com");
        loginPage.inputPassword("Maulana ");
        loginPage.clickLoginBtn();
        loginPage.headerDisplayed();
    }

    @When("I click a person icon")
    public void iClickAPersonIcon() {
        logoutPage.clickPersonIcon();
    }

    @And("I click logout icon")
    public void iClickLogoutIcon() {
        logoutPage.clickLogoutIcon();
    }

    @Then("I will go to login page")
    public void iWillGoToLoginPage() {
        registPage.validMessageDisplayed();
    }
}
