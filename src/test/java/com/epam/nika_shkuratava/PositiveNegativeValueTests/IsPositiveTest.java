package com.epam.nika_shkuratava.PositiveNegativeValueTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 6/2/2017.
 */
public class IsPositiveTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorPositiveTestDataProvider")
    public Object[][] PositiveDataProvider() {
        return new Object[][]{
                {1L},
                {4L},
                {Long.MAX_VALUE},
        };
    }

    @DataProvider(name = "calculatorNegativeTestDataProvider")
    public Object[][] NegativeDataProvider() {
        return new Object[][]{
                {Long.MIN_VALUE},
                {-1L}
        };
    }

    @Test(dataProvider = "calculatorPositiveTestDataProvider")
    public void checkPositive(long val) {
        Assert.assertTrue(calculator.isPositive(val));
    }

    @Test(dataProvider = "calculatorNegativeTestDataProvider")
    public void checkNegative(long val) {
        Assert.assertFalse(calculator.isPositive(val));
    }

    @Test
    public void checkZero() {
        Assert.assertFalse(calculator.isPositive(0));
    }

}
