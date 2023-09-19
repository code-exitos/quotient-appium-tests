package steps;

import io.cucumber.java.en.Given;

import org.testng.annotations.Test;

import screens.OnboardingScreen;
import setups.Capabilities;

import java.net.MalformedURLException;

public class OnboardingStep extends Capabilities {
    OnboardingScreen onboardingScreen;

    {
        try {
            onboardingScreen = new OnboardingScreen();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Given("User clicks on the button Next")
    public void actions() throws Exception {
        onboardingScreen.go_to_register();
    }
}