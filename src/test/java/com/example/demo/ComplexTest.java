package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComplexTest {
    @Test
    void Magnitude() {
        Complex test = new Complex(3,4);
        double expected = 5;

        test.calcMagnitude();
        double res1 = test.magnitude;

        Assertions.assertEquals(expected, res1);
    }

    @Test
    void Phase() {
        Complex test = new Complex(Math.sqrt(3),1);
        double expected = Math.PI/3;

        test.calcPhase();
        double res1 = test.phase;

        Assertions.assertEquals(expected, res1);
    }
}
