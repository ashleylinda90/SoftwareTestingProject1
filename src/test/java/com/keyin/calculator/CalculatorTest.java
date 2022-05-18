package com.keyin.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculatorUnderTest = new Calculator();

    @Test
    public void testAdd() {
        Assertions.assertEquals(2, calculatorUnderTest.add(1,1));

        int resultTwo = calculatorUnderTest.add(2,2);
        Assertions.assertEquals(4, resultTwo);
        System.out.println("Result Two = " + resultTwo);

        Assertions.assertNotEquals(3, calculatorUnderTest.add(2,2));
    }
}
