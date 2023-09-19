package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.testng.annotations.Test;

import pages.OnboardingPage;
import setups.Capabilities;

import java.net.MalformedURLException;

public class OnboardingStep extends Capabilities {
    OnboardingPage onboardingPage;

    {
        try {
            onboardingPage = new OnboardingPage();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Given("User clicks on the button Next")
    public void clicks_on_next() { onboardingPage.click_next_button(); }
    @And("User clicks on the button Create Identity")
    public void clicks_on_create_identity() { onboardingPage.click_create_identity(); }
    @And("User enters the required information on the Create Identity screen")
    public void creates_user() { onboardingPage.enter_user_data(); }
    @And("User clicks on the button Continue")
    public void clicks_on_continue() { onboardingPage.click_continue(); }
    @Then("The user should be sent to the Create a Personal Identity Number screen")
    public void create_identity_number_screen() { onboardingPage.create_identity_number(); }
}