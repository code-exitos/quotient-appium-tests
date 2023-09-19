package screens;

import io.appium.java_client.MobileBy;

import org.openqa.selenium.By;

import setups.Capabilities;

import java.net.MalformedURLException;

public class OnboardingScreen {
    Capabilities capabilities = new Capabilities();
    static By CreateAccountButtonStep0 = MobileBy.AccessibilityId("CreateAccountButtonStep0");
    static By CreateAccountButtonStep1 = MobileBy.AccessibilityId("CreateAccountButtonStep1");

    public OnboardingScreen() throws MalformedURLException {
        capabilities.preparation();
    }

    public void go_to_register() {
        capabilities.driver.findElement(CreateAccountButtonStep0).click();
        capabilities.driver.findElement(CreateAccountButtonStep1).click();
    }
}
