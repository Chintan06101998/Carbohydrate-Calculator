package org.example.carbohydratecalculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarbohydrateCalculatorTest extends BaseTest {

    // Can do with multiple options... For example I can test with differnet value of exercise
    @DataProvider(name = "activityLevels")
    public Object[][] activityLevels() {
        return new Object[][] {
                {"Moderate: exercise 4-5 times/week"}
//                {"Light: exercise 1-3 times/week"},
//                {"Active: daily exercise or intense exercise 3-4 times/week"},
//                {"Very Active: intense exercise 6-7 times/week"},
//                {"Extra Active: very intense exercise daily, or physical job"}

        };
    }

    @Test(dataProvider = "activityLevels")
    public void testCarbohydrateRecommendation(String activityLevel) {
        driver.get("https://www.calculator.net/carbohydrate-calculator.html");


        CarbohydrateCalculatorPage calculatorPage = new CarbohydrateCalculatorPage(driver);

        // Enter Data : I can use new data provide here as well
        calculatorPage.enterUserData("30", "180", "75", activityLevel);
        calculatorPage.clickCalculate(); // click button

        String carbRecommendation = calculatorPage.getCarbRecommendation();

        // Veriftying in Terminal though We can do assert as well.
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Carb Recommendation: " + carbRecommendation);
        System.out.println("---");
    }
}
