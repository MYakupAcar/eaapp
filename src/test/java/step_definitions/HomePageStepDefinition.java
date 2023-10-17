package step_definitions;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageStepDefinition {
    HomePage hp = new HomePage();
    @Given("User goes to home page")
    public void userGoesToHomePage() {
        hp.navigateToHomePage();


    }
}
