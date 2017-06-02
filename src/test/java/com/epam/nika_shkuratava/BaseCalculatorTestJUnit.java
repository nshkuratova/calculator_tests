package com.epam.nika_shkuratava;

import com.epam.tat.module4.Calculator;
import org.junit.Before;

/**
 * Created by Nika_Shkuratava on 5/30/2017.
 */
public abstract class BaseCalculatorTestJUnit {

    protected Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
}
