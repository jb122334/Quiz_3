package com.jwetherell.algorithms.mathematics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jwetherell.algorithms.mathematics.Multiplication;

public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        assertEquals(6, Multiplication.multiplication(2, 3));
        assertEquals(-6, Multiplication.multiplication(-2, 3));
        assertEquals(6, Multiplication.multiplication(-2, -3));
        assertEquals(1, Multiplication.multiplication(0, 3)); //special case: zero returns 1
    }

    @Test
    public void testMultiplyUsingLoop() {
        assertEquals(6, Multiplication.multiplyUsingLoop(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingLoop(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingLoop(-2, -3));
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 3));
    }

    @Test
    public void testMultiplyUsingRecursion() {
        assertEquals(6, Multiplication.multiplyUsingRecursion(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingRecursion(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingRecursion(-2, -3));
        assertEquals(0, Multiplication.multiplyUsingRecursion(0, 3));
    }

    @Test
    public void testMultiplyUsingShift() {
        assertEquals(6, Multiplication.multiplyUsingShift(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingShift(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingShift(-2, -3));
        assertEquals(0, Multiplication.multiplyUsingShift(0, 3));
    }

    @Test
    public void testMultiplyUsingLogs() {
        assertEquals(6, Multiplication.multiplyUsingLogs(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingLogs(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingLogs(-2, -3));
        assertEquals(0, Multiplication.multiplyUsingLogs(0, 3));
    }

    @Test
    public void testMultiplyUsingFFT() {
        assertEquals("6", Multiplication.multiplyUsingFFT("2", "3"));
        assertEquals("-6", Multiplication.multiplyUsingFFT("-2", "3"));
        assertEquals("6", Multiplication.multiplyUsingFFT("-2", "-3"));
        assertEquals("0", Multiplication.multiplyUsingFFT("0", "3"));
    }

    @Test
    public void testMultiplyUsingLoopWithStringInput() {
        assertEquals("6", Multiplication.multiplyUsingLoopWithStringInput("2", "3"));
        assertEquals("-6", Multiplication.multiplyUsingLoopWithStringInput("-2", "3"));
        assertEquals("6", Multiplication.multiplyUsingLoopWithStringInput("-2", "-3"));
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("0", "3"));
    }

    @Test
    public void testMultiplyUsingLoopWithIntegerInput() {
        assertEquals(6, Multiplication.multiplyUsingLoopWithIntegerInput(2, 3));
        assertEquals(-6, Multiplication.multiplyUsingLoopWithIntegerInput(-2, 3));
        assertEquals(6, Multiplication.multiplyUsingLoopWithIntegerInput(-2, -3));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(0, 3));
    }
}
