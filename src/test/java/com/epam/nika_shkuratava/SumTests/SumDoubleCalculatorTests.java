package com.epam.nika_shkuratava.SumTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
public class SumDoubleCalculatorTests extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorSumDoubleDataProvider")
    public Object[][] sumDoubleDataProvider() {
        return new Object[][]{
                {1.4d, 1.8d, 3.2d},
                {0.0d, 0.0d, 0.0d},
                {2.0d, 3.0d, 5.0d},
                {Double.MIN_VALUE, Double.MAX_VALUE, 1.7976931348623157E308},
                {-2.0d, -3.0d, -5.0d},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.POSITIVE_INFINITY}

        };
    }

    @Test(dataProvider = "calculatorSumDoubleDataProvider")
    public void checkDoubleSum(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}
