@QuotientTest
Feature: AppiumTest

  @DoTest
  Scenario: User goes to the Create Identity screen
    Given User clicks on the button Next
    And User clicks on the button Create Identity
    And User enters the required information on the Create Identity screen
    And User clicks on the button Continue
    Then The user should be sent to the Create a Personal Identity Number screen