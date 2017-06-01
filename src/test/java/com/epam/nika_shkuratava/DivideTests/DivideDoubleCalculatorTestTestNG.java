package com.epam.nika_shkuratava.DivideTests;

import com.epam.nika_shkuratava.BaseCalculatorTestTestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
public class DivideDoubleCalculatorTestTestNG extends BaseCalculatorTestTestNG{

        @DataProvider(name = "calculatorDivDoubleDataProvider")
        public Object[][] divDoubleDataProvider() {
            return new Object[][]{
                    {8.0d, 8.0d, 1.0d},
                    {0d, 0d, NaN},
                    {5d, 2d, 2.5d},
                    {-4d, -2d, 2d},
                    {5.0d, 0.0d, Double.POSITIVE_INFINITY},
                    {3.5d, 1.5d, 2.3333333333333335d}
            };
        }

        @Test(dataProvider = "calculatorDivDoubleDataProvider")
        public void checkDoubleDiv(double a, double b, double expectedResult) {
            double result = calculator.div(a, b);
            Assert.assertEquals(expectedResult, result);
        }
    }
