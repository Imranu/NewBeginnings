package com.qa.test;

import com.qa.calculatorpackage.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calcytesty = new Calculator();

    @Test
    public void simpleTest() {
        assertEquals("5 * 3 = 15. 15 / 3 = 5. 15 / 5 = 3. ", new int[]{5, 3, 15});
    }

    @Test
    public void secondTest() {
        assertEquals("4 * 2 = 8. 8 / 2 = 4. 8 / 4 = 2. ", new int[]{4, 2, 8});
    }

    // add, subtract, multiply, or divide


}
