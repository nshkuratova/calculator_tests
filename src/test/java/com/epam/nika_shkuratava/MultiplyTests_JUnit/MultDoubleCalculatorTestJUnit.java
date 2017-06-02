package com.epam.nika_shkuratava.MultiplyTests_JUnit;

import com.epam.nika_shkuratava.BaseCalculatorTestJUnit;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
@RunWith(Parameterized.class)
public class MultDoubleCalculatorTestJUnit extends BaseCalculatorTestJUnit {

    @Parameterized.Parameter(0)
    public double a;
    @Parameterized.Parameter(1)
    public double b;
    @Parameterized.Parameter(2)
    public double expected;

    // creates the test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] dataDouble = new Object[][] { { 1.0d , 2.0d, 2.0d }, { 5.3d, 3.5d, 18.55d }, { -121.0d, 4.0d, -484.0d },{ -2.0d, -2.0d, 4.0d }, {Double.MAX_VALUE, Double.MAX_VALUE, Double.POSITIVE_INFINITY} };
        return Arrays.asList(dataDouble);
    }

   @Test
    public void testMultDoubleCalculator() {
        double result = calculator.mult(a,b);
        assertEquals(expected, result, 0.0001);
    }
}
