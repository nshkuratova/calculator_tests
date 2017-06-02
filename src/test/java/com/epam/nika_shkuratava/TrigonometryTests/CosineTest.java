package com.epam.nika_shkuratava.TrigonometryTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 6/2/2017.
 */
public class CosineTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorCosineDataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {0d, 1d},
                {30d, 0.15d},
                {45d, 0.525d},
                {60d, -0.95d},
                {90d, -0.44d}
        };
    }

    @Test(dataProvider = "calculatorCosineDataProvider")
    public void checkCosine(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertTrue(Math.abs(result - expectedResult) < 0.1);
    }
}
