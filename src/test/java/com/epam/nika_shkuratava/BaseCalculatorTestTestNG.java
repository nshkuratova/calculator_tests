package com.epam.nika_shkuratava;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

/**
 * Created by Nika_Shkuratava on 5/30/2017.
 */
public abstract class BaseCalculatorTestTestNG {

    protected Calculator calculator;

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("@BeforeGroups");
    }

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("@AfterGroups");
    }
}
