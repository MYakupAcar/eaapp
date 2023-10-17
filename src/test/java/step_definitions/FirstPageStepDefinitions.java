package step_definitions;

import io.cucumber.java.en.And;
import pages.FirstPage;

public class FirstPageStepDefinitions {

    FirstPage fp = new FirstPage();
    @And("User goes to Employee Page")
    public void userGoesToEmployeePage() {
        fp.navigateToEmployeeList();
    }
}
