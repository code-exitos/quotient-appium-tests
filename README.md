# AUTOMATED TESTS

1. [Tools used to run a test](#Tools-used-to-run-a-test)
   * [Appium Desktop](#Appium-Desktop) 
   * [Appium Inspector](#Appium-Inspector)
   * [JDK](#JDK)
   * [Emulator](#Emulator)
2. [Steps to create or run a test](#Steps-to-create-or-run-a-test)
   * [Structure of the repository](#Structure-of-the-repository)
        - [Setups](#Setups)
        - [Features](#Features)
        - [Pages](#Pages)
        - [Steps](#Steps)
3. [Example](#Example)

## Tools and libraries used to run a test
1. Download and install `Appium Server` 
2. Download and install `Appium Inspector`
3. Install `JDK` (Java Development Kit)
4. Connect and setup a `mobile emulator`

### Appium
You can run the an appium server using the `Appium Desktop` app or installing it with `Node js`
* `Method 1`: Install Appium using Node.js
  - Follow this instructions: https://appium.io/docs/en/2.1/quickstart/install/
  <img width="797" alt="Screenshot 2023-09-22 at 15 52 07" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/2c6b364d-6cd7-46ad-a26a-c376e7523a93">

* `Method 2`: Install Appium using Appium Desktop Client: 
  - Find the link here: https://github.com/appium/appium-desktop/releases/tag/v1.22.3-4
 <img width="1331" alt="Screenshot 2023-09-22 at 15 51 24" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/cc76b03b-54e1-445d-8241-44ae81797f79">

### Appium Inspector
Appium inspector allows you to check the selectors of the app, this is `optional`, you can also find the selectors on the quotient-terminal codebase.

1. Installation 
- Install it here: https://github.com/appium/appium-inspector/releases
- More documentation: https://github.com/appium/appium-inspector

2. Setup
- Once it is installed the next step is to set up the capabilities of the emulated mobile that will be used.
- More documentation about capabilities: https://appium.io/docs/en/2.1/guides/caps/
- Example with my own setup:<br>
<img width="1549" alt="Screenshot 2023-09-22 at 15 49 50" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/1d6e345c-8e01-4c3c-8369-50b4ad5cc2cc">

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
* The emulator `setups` is located in this class path `src/test/java/setups`, in this route we must edit the Capabilities class
* The `features` with Gherkin are located in: `src/main/resources/features/`
* The `pages` that contains test actions and locators are located inside this path: `src/test/java/pages/`
* The `steps` where we execute each Gherkin keyword of a scenario are located in this path: `src/test/java/steps/`

#### Setups
Inside this folder we have the Capabilities class, in this class you must set the capabilities of the phone that you are emulating

#### Features
In this folder we create the `test cases` that must be done with the `Gherkin` syntax, for this we are using `Cucumber framework` that executes tests written in the Gherkin language in this project.
* There is a example of this on the Onboarding scenario feature that is located in this path: src/main/resources/features/OnboardingScenario.feature

#### Pages
In this folder we create a class where we declare the `methods` and `locators` for the elements of the screen that we are testing
* Methods where we define the actions that will be done on each step of the tests
* Locators (selectors) of the screen elements (buttons, inputs, etc)

#### Steps
In this folder we create a class with the steps that are execution of the scenario keywords<br>
Some examples of keywords are:
- Feature
- Scenario
- Given, When, Then, And, But for steps (or *)

## Example
For this example I'm going to use the Onboarding test that is already done

*Step 1*: Configure the `capabilities` inside the Capabilities file<br>
<img width="1235" alt="Screenshot 2023-09-22 at 15 31 03" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/33fbb1f7-3a7e-49ad-81fc-0dc05d012da3">

*Step 2*: Create the `feature` inside the features folder<br>
<img width="642" alt="Screenshot 2023-09-22 at 15 37 27" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/19616da6-a1bd-407a-a071-1c287eca9173">

*Step 3*: Create a page file and inside it `get the selectors` and `create the methods` that will use this selectors inside the pages folder<be>
<img width="1496" alt="Screenshot 2023-09-22 at 15 40 11" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/f8fd3c4a-13e0-4fc6-99bb-53e85a914e44">

*Step 4*: Create the `test steps` inside the steps folder<br>
<img width="1314" alt="Screenshot 2023-09-22 at 15 41 17" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/209573eb-30d2-463d-9435-08517133c062">

*Step 5*: Run the scenario<br>
<img width="750" alt="Screenshot 2023-09-22 at 15 42 15" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/f669a2d2-196d-490b-9e35-24920aa32338">

*Step 6*: See the results<br>
<img width="1260" alt="Screenshot 2023-09-22 at 15 47 30" src="https://github.com/code-exitos/quotient-appium-tests/assets/65067847/8039d445-7c76-421d-9a56-d97dd4699ffa">

#### Authors
Kimberly García - initial setup and tests
