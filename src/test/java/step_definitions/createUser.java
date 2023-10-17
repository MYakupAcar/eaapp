package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateUserPage;

public class createUser {

    CreateUserPage user = new CreateUserPage();
    @And("User add {string}, {string}, {string}, {string}, {string}")
    public void userAdd(String name, String salary, String workedDuration, String grade, String email) {
        user.addNewUser(name, salary, workedDuration,grade,email);
    }

    @Then("User see added emloyee with {string}, {string}, {string}, {string}, {string}")
    public void userSeeAddedEmloyeeWith(String arg0, String arg1, String arg2, String arg3, String email) {
        user.checkemail(email);
    }

    @When("user clicks create")
    public void userClicksCreate() {
        user.clickCreateNewUser();



    }

    @And("User clicks create button")
    public void userClicksCreateButton() {
        user.clickCreate();
    }
}
