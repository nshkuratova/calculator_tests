package com.epam.nika_shkuratava.MultiplyTests_JUnit;

import com.epam.nika_shkuratava.BaseCalculatorTestJUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by nika.shkuratova on 01.06.2017.
 */
@RunWith(Parameterized.class)
public class MultLongCalculatorTestJUnit extends BaseCalculatorTestJUnit {

        @Parameterized.Parameter(0)
        public double a;
        @Parameterized.Parameter(1)
        public double b;
        @Parameterized.Parameter(2)
        public double expected;

        // creates the test data
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            Object[][] dataDouble = new Object[][] { { 1l , 2l, 2l }, { 5l, 3l, 15l }, { -121l, 4l, -484l },{ -2l, -2l, 4l } };
            return Arrays.asList(dataDouble);
        }

        @Test
        public void testMultDoubleCalculator() {
            double result = calculator.mult(a,b);
            assertEquals(expected, result, 0);
        }
    }