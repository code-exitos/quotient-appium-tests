# AUTOMATED TESTS

1. [Tools used to run a test](#Tools-used-to-run-a-test)
   * [Appium Desktop](#Appium-Desktop) 
   * [Appium Inspector](#Appium-Inspector)
2. [Steps to run a test](#Steps-to-run-a-test)

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

## Steps to run a test
1. Clone this repository: https://github.com/code-exitos/quotient-appium-tests.git

### Authors
Kimberly García - initial setup and tests