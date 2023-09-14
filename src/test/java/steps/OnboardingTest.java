package steps;

import io.cucumber.java.en.Given;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.cucumber.java.Before;

import setups.Capabilities;

public class OnboardingTest extends Capabilities {

    @Before
    @BeforeTest
    public void setup() throws Exception{
        preparation();
    }

    @Given("User clicks on the button called next")
    @Test
    public void clicks_on_next() {
        driver.findElementByAccessibilityId("CreateAccountButton").click();
    }
}