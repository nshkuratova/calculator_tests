package com.epam.nika_shkuratava.TrigonometryTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 6/2/2017.
 */
public class CotangentTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorCotangentDataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {0d, Double.POSITIVE_INFINITY},
                {30d, -0.15d},
                {45d, 0.61d},
                {60d, 3.12d},
                {90d, -0.501d}
        };
    }

    @Test(dataProvider = "calculatorCotangentDataProvider")
    public void checkCotangent(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertTrue(Math.abs(result - expectedResult) < 0.1);
    }
}
