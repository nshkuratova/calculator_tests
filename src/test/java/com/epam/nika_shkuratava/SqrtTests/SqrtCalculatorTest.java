package com.epam.nika_shkuratava.SqrtTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Nika_Shkuratava on 6/2/2017.
 */
public class SqrtCalculatorTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorSqrtDataProvider")
    public Object[][] sumDoubleDataProvider() {
        return new Object[][]{
                {4d, 2d}
        };
    }

    @Test(dataProvider = "calculatorSqrtDataProvider")
    public void checkSqrt(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult);
    }

    //todo Change the test to specify the exception type after the fix of the bug NNNN-23)
    @Test(expectedExceptions = Exception.class)
    public void checkSqrtNegative() {
        calculator.sqrt(-4);
    }
}
