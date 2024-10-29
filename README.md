# Carbohydrate Calculator Test Automation with Selenium and TestNG

This project automates tests for a Carbohydrate Calculator web application.

## Project Structure

* `src/test/java/`: Contains Java source code for the tests.
    * `org/example/carbohydratecalculator/`: Package for test classes and Page Object Model.
        * `CarbohydrateCalculatorPage.java`: Page Object Model class for interacting with the Carbohydrate Calculator page.
        * `CarbohydrateCalculatorTest.java`: Test class containing data-driven tests for different activity levels.
* `src/test/resources/`: Contains test configuration files.
    * `testng.xml`: TestNG configuration file for managing and running test suites.

## Setup Prerequisites

To run the tests, you'll need:

* Java installed 
* Selenium WebDriver 
* TestNG 
* ChromeDriver

## Run Tests

You can run the tests in two ways:

1. **Using `testng.xml`:** Execute the `testng.xml` file from your command line using the `testng` command.
2. **Using your IDE:** Most IDEs allow running TestNG tests directly

## Key Features

* **Page Object Model (POM):** Organizes page interactions into a separate class for easy maintenance and code reusability.
* **Data-Driven Testing:** Uses TestNG's DataProvider to automate tests with different user activity levels, reducing code duplication.
