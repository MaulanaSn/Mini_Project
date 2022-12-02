package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.LogoutPage;
import com.example.app.pages.RegistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStep {
    RegistPage registPage = new RegistPage();
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();
    @Given("I have login on Alta Store")
    public void iHaveLoginOnAltaStore() {
        registPage.clickLoginIcon();
        loginPage.inputEmailLogin("bayuseptyan43@gmail.com");
        loginPage.inputPasswordLogin("mobil-mobilan ");
        loginPage.clickLoginBtn();
        registPage.success();
    }

    @When("I click logout icon")
    public void iClickLogoutIcon() {
        logoutPage.clickLogoutBtn();
    }

    @Then("I will go to login page")
    public void iWillGoToLoginPage() {
        registPage.clickLoginIcon();
    }
}
