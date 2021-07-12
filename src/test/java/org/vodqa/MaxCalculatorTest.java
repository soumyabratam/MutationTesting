package org.vodqa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vodqa.MaxCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxCalculatorTest {

    private MaxCalculator maxcalculator;

    @BeforeEach
    void setUp() {
        maxcalculator = new MaxCalculator();
    }

    @Test
    void checkForPositiveNumbers() {
        assertEquals(900, maxcalculator.findMax(new int[]{67, 45, 900, 13, 23, 198}),
                "Max value should be 900");
    }

    @Test
    void checkForNegativeNumbers() {
        assertEquals(-1, maxcalculator.findMax(new int[]{-2, -1, -89, -56}),
                "Max value should be -1");
    }

    @Test
    void checkForNuLLArray() {
        assertEquals(0, maxcalculator.findMax(new int[]{}),
                "Max value should be 0");
    }

    @Test
    void checkForArrayWithOneElement() {
        assertEquals(-9, maxcalculator.findMax(new int[]{-9}),
                "Max value should be -9");
    }

    @Test
    void checkForMixedArray() {
        assertEquals(98, maxcalculator.findMax(new int[]{2, 56, 98, -98, -76}),
                "Max value should be 98");
    }

    @Test
    void checkForMixedArrayContDuplicates() {
        assertEquals(3, maxcalculator.findMax(new int[]{3, 3}),
                "Max value should be 3");
    }

    @Test
    void checkForMixedArrayDuplicates() {
        assertEquals(3, maxcalculator.findMax(new int[]{3, 1, 3, 0, 3}),
                "Max value should be 98");
    }


}
