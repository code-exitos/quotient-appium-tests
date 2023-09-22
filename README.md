# AUTOMATED TESTS

1. [Tools used to run a test](#Tools-used-to-run-a-test)
   * [Appium Desktop](#Appium-Desktop) 
   * [Appium Inspector](#Appium-Inspector)
   * [JDK](#JDK)
   * [Emulator](#Emulator)
2. [Steps to create or run a test](#Steps-to-create-or-run-a-test)
   * [Structure of the repository](#Structure-of-the-repository)

## Tools and libraries used to run a test
1. Download and install `Appium Server` 
2. Download and install `Appium Inspector`
3. Install `JDK` (Java Development Kit)
4. Connect and setup a `mobile emulator`

### Appium Desktop
You can run the an appium server using the `Appium Desktop` app or installing it with `Node js`
* `Method 1`: Install Appium using Node.js
  - Follow this instructions: https://appium.io/docs/en/2.1/quickstart/install/
* `Method 2`: Install Appium using Appium Desktop Client: 
  - Find the link here: https://github.com/appium/appium-desktop/releases/tag/v1.22.3-4

### Appium Inspector
Appium inspector allows you to check the selectors of the app, this is `optional`, you can also find the selectors on the quotient-terminal codebase.

1. Installation 
- Install it here: https://github.com/appium/appium-inspector/releases
- More documentation: https://github.com/appium/appium-inspector

2. Setup
- Once it is installed the next step is to set up the capabilities of the emulated mobile that will be used.
- More documentation about capabilities: https://appium.io/docs/en/2.1/guides/caps/
- Example with my own setup:

### JDK
Install JDK and set up the variables on your computer in .bash_profile or .bashrc file.
* Setup instructions: https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux

### Emulator
If you use Android Studio you must set the Environment Variables in the `edit configurations` options of Appium Server

## Steps to create or run a test
1. Clone this repository: https://github.com/code-exitos/quotient-appium-tests.git
2. Open the repository using your preferred IDE for example VS code or IntelliJ 

### Structure of the repository
This repository is using a POM (Project Page Model) structure
* The emulator `capabilities` is located in this class path `src/test/java/setups/Capabilities.java`
* The `test cases` with Gherkin are located in: `src/main/resources/features/`
* The `test actions` and `locators` are located inside this path: `src/test/java/screens/`
* The `test steps` are located in this path: `src/test/java/steps/`

#### Capabilities
In this java class you must set the capabilities of the phone that you are emulating

#### Test cases
The test cases must be done with the `Gherkin` syntax, for this we are using `Cucumber framework` that executes tests written in the Gherkin language in this project.
* There is a example of this on the Onboarding scenario feature that is located in this path: src/main/resources/features/OnboardingScenario.feature

#### Test actions
In this files we must declare the `methods` and `locators` for the elements of the screen that we are testing
* Methods where we define the actions that will be done on each step of the tests
* Locators (selectors) of the screen elements (buttons, inputs, etc)

#### Test steps
The steps are execution of the scenario keywords<br>
Some examples of keywords are:
- Feature
- Scenario
- Given, When, Then, And, But for steps (or *)

## Example
For this example I'm going to use the Onboarding test that is already done

### Authors
Kimberly García - initial setup and tests