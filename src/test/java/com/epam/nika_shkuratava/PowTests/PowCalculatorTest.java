package com.epam.nika_shkuratava.PowTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
public class PowCalculatorTest extends BaseCalculatorTestTestNG {

    @DataProvider(name = "calculatorPowDataProvider")
    public Object[][] sumDoubleDataProvider() {
        return new Object[][]{
                {1d, 2d, 1d},
                {0.5d, 5d, 0.03125d},
                {2d, 0.5d, 1.414d},
                {-2d, -5d, -0.03125d}
        };
    }

    @Test(dataProvider = "calculatorPowDataProvider")
    public void checkPow(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}
