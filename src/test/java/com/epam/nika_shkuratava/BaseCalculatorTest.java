package com.epam.nika_shkuratava;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

/**
 * Created by Nika_Shkuratava on 5/30/2017.
 */
public abstract class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        //System.out.println("Prepare instance of calculator");
        calculator = new Calculator();

    }
}
