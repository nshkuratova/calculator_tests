package com.epam.nika_shkuratava.TrigonometryTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 6/2/2017.
 */
public class SineTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorSineDataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {0d, 0d},
                {30d, -0.98d},
                {45d, 0.85d},
                {60d, -0.304d},
                {90d, 0.89d}
        };
    }

    @Test(dataProvider = "calculatorSineDataProvider")
    public void checkSine(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertTrue(Math.abs(result - expectedResult) < 0.1);
    }
}
