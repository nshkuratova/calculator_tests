package com.epam.nika_shkuratava.SumTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 5/30/2017.
 */
public class SumLongCalculatorTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorSumLongDataProvider")
    public Object[][] sumLongDataProvider() {
        return new Object[][]{
                {4l, 8l, 12l},
                {0l, 0l, 0l},
                {2l, 3l, 5l},
                {Long.MIN_VALUE, Long.MAX_VALUE, -1l},
                {-2l, -3l, -5l},
                {Long.MAX_VALUE, Long.MAX_VALUE, -2}

        };
    }

    @Test(dataProvider = "calculatorSumLongDataProvider", groups = "basicRegression")
    public void checkLongSum(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}