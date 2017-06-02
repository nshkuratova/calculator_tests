package com.epam.nika_shkuratava.SubstractionTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
public class SubDoubleCalculatorTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorSubDoubleDataProvider")
    public Object[][] subDoubleDataProvider() {
        return new Object[][]{
                {0.6d, 0.4d, 0.2d},
                {0.0, 0.0, 0.0},
                {2.0d, 3.0d, -1.0d},
                {Double.MAX_VALUE, Double.MIN_VALUE, 1.7976931348623157E308},
                {Double.MAX_VALUE + 1, Double.MAX_VALUE + 1, 0},
                {-2.0, -3.0, 1.0}

        };
    }

    @Test(dataProvider = "calculatorSubDoubleDataProvider")
    public void checkDoubleSum(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        Assert.assertTrue(Math.abs(result - expectedResult) < 0.00001);
    }
}