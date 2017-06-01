package com.epam.nika_shkuratava.DivideTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
public class DivideLongCalculatorTestTestNG extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorDivLongDataProvider")
    public Object[][] divLongDataProvider() {
        return new Object[][]{
                {8l, 8l, 1l},
                {0l, 0l, NaN},
                {5l, 2l, 2.5d},
                {-4l, -2l, 2l},
                {Long.MAX_VALUE, Long.MAX_VALUE, 1}
        };
    }

    @Test(dataProvider = "calculatorDivLongDataProvider")
    public void checkDoubleDiv(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test  (expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp ="Attempt to divide by zero")
    public void checkDoubleDivByZero() {
        double result = calculator.div(1, 0);
    }
}
