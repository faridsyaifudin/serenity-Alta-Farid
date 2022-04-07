package api.starter.postcodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepsDefinition {
    @And("user input email data")
    public void userInputEmailData() {
        System.out.println("input email");
    }

    @And("user input passsword data")
    public void userInputPasswordData() {
        System.out.println("input password");
    }

    @And("user input address data")
    public void userInputAddressData() {
        System.out.println("input alamat");
    }

    @And("user input password data")
    public void userInputPasswordData() {
    }

    @When("user click register button")
    public void userClickRegisterButton() {
    }

    @Then("user should be redirected to dashboard homepage")
    public void userShouldBeRedirectedToDashboardHomepage() {
    }

    @Then("user should be able to see warning message or Register button is disabled")
    public void userShouldBeAbleToSeeWarningMessageOrRegisterButtonIsDisabled() {
    }

    @When("user click register with google account")
    public void userClickRegisterWithGoogleAccount() {
    }

    @Then("user should be redirected to Google page")
    public void userShouldBeRedirectedToGooglePage() {
    }

    @When("user is click register with facebook account")
    public void userIsClickRegisterWithFacebookAccount() {
    }

    @Then("user should be redirected to facebook page")
    public void userShouldBeRedirectedToFacebookPage() {
    }
}
