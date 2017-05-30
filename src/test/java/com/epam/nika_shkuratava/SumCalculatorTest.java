package com.epam.nika_shkuratava;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 5/30/2017.
 */
public class SumCalculatorTest extends BaseCalculatorTest {

    @DataProvider(name = "calculatorSumDoubleDataProvider")
    public Object[][] sumDoubleDataProvider() {
        return new Object[][]{
                {1.4, 1.8, 3.2},
                {0.0, 0.0, 0.0},
                {2.0, 3.0, 5.0}

        };
    }

    @DataProvider(name = "calculatorSumLongDataProvider")
    public Object[][] sumLongDataProvider() {
        return new Object[][]{
                {4, 8, 12},
                {0, 0, 0},
                {2, 3, 5}

        };
    }

    @Test(dataProvider = "calculatorSumDoubleDataProvider")
    public void checkDoubleSum(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult);
    }


    @Test(dataProvider = "calculatorSumLongDataProvider")
    public void checkLongSum(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}