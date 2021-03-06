package com.epam.nika_shkuratava;

import com.epam.tat.module4.Calculator;
import org.testng.ITestContext;
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

    @BeforeClass (alwaysRun = true)
    public void setUp(final ITestContext testContext) {
        calculator = new Calculator();
        System.out.println("=========================");
        System.out.println("Test class - " + testContext.getName());

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
