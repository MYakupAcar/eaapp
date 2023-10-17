package step_definitions;

import io.cucumber.java.en.And;
import pages.LoginPage;

public class LoginStepDefinitions {

    LoginPage lp = new LoginPage();
    @And("User login with given credentials")
    public void userLoginWithGivenCredentials() {
        lp.fillTheUserNameAndPasswordBox();
        lp.clickSubmitButton();
    }
}
