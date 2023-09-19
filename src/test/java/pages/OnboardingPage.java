package pages;

import io.appium.java_client.MobileBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import setups.Capabilities;

import java.net.MalformedURLException;

public class OnboardingPage {
    Capabilities capabilities = new Capabilities();

    static By CreateAccountButtonStep0 = MobileBy.AccessibilityId("CreateAccountButtonStep0");
    static By CreateAccountButtonStep1 = MobileBy.AccessibilityId("CreateAccountButtonStep1");
    static By UserNameInput = MobileBy.AccessibilityId("auth-input");
    static By CheckBox = MobileBy.className("android.widget.CheckBox");
    static By ContinueButton = MobileBy.AccessibilityId("auth-form-button");
    static By StepTitle = MobileBy.AccessibilityId("auth-step-title");

    public OnboardingPage() throws MalformedURLException {
        capabilities.preparation();
    }


    public void click_next_button() {
        capabilities.driver.findElement(CreateAccountButtonStep0).click();
    }

    public void click_create_identity() {
        capabilities.driver.findElement(CreateAccountButtonStep1).click();
    }

    public void enter_user_data() {
        capabilities.driver.findElement(UserNameInput).sendKeys("Kimberly");
        ((AndroidDriver<MobileElement>) capabilities.driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        capabilities.driver.findElement(CheckBox).click();
    }

    public void click_continue() {
        capabilities.driver.findElement(ContinueButton).click();
    }

    public void create_identity_number() {
        capabilities.driver.findElement(StepTitle).isDisplayed();
    }
}
