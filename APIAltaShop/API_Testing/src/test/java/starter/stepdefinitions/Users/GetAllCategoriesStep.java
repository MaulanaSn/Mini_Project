package starter.stepdefinitions.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Users.GetAllCategories;

public class GetAllCategoriesStep {
    @Steps
    GetAllCategories getAllCategories;
    @Given("I set url categories")
    public void iSetUrlCategories() {
        getAllCategories.setUrlCategories();
    }
    @When("I request get categories")
    public void iRequestGetCategories() {
        getAllCategories.requestGetCategories();
    }
    @Then("I will get 401")
    public void iWillGet401() {
        getAllCategories.validateStatusCode();
    }


}
