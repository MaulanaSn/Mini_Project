package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.RegistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep {
    RegistPage registPage = new RegistPage();
    LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        registPage.clickLoginIcon();
    }

    @When("I input {string} email {string} password")
    public void iInputEmailPassword(String arg0, String arg1) {
        loginPage.inputEmailLogin(arg0);
        loginPage.inputPasswordLogin(arg1);
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }
}
