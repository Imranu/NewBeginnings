package com.qa.test;

import com.qa.calculatorpackage.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calcytesty = new Calculator();

    @Test
    public void simpleTest() {
        assertEquals("5 * 3 = 15. 15 / 3 = 5. 15 / 5 = 3. ", this.calcytesty.calculate(new int[] {5, 3, 15}));
    }

    @Test
    public void secondTest() {
        assertEquals("4 * 2 = 8. 8 / 2 = 4. 8 / 4 = 2. ", this.calcytesty.calculate(new int[] {4, 2, 8}));
    }

    @Test
    public void noneTest() {
        assertEquals("None", this.calcytesty.calculate(new int[] {99, 2123, 43}));
    }
    
    // add, subtract, multiply, or divide


}
