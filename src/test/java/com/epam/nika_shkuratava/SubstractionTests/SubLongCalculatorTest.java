package com.epam.nika_shkuratava.SubstractionTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
public class SubLongCalculatorTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorSubLongDataProvider")
    public Object[][] subLongDataProvider() {
        return new Object[][]{
                {4, 8, -4},
                {0, 0, 0},
                {3, 2, 1},
                {Long.MAX_VALUE, Long.MIN_VALUE, -1},
                {-2, -3, 1}

        };
    }

    @Test(dataProvider = "calculatorSubLongDataProvider")
    public void checkLongSum(long a, long b, long expectedResult) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}
