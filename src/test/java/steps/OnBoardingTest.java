package steps;

import cucumber.api.java.en.Given;
import setups.Capabilities;

public class OnBoardingTest extends Capabilities {

    @Given("User clicks on the button called next")
    public void click_App_Button() throws Throwable  {
        driver.findElementByAccessibilityId("CreateAccountButton").click();
        throw new io.cucumber.java.PendingException();
    }
}