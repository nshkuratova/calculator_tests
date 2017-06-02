package com.epam.nika_shkuratava.TrigonometryTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 6/2/2017.
 */
public class TangentTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorTangentDataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {0d, 0d},
                {30d, -6.405d},
                {45d, 1.619d},
                {60d, 0.32d},
                {90d, -1.995d}
        };
    }

    @Test(dataProvider = "calculatorTangentDataProvider")
    public void checkTangent(double a, double expectedResult) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedResult);
        Assert.assertTrue(Math.abs(result - expectedResult) < 0.1);
    }
}
