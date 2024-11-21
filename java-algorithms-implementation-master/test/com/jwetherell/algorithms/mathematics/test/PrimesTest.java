package com.jwetherell.algorithms.mathematics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.jwetherell.algorithms.mathematics.Primes;

import java.util.Map;

public class PrimesTest {

    @Test
    public void testGetPrimeFactorization() {
        // Regular cases
        Map<Long, Long> factors = Primes.getPrimeFactorization(28);
        assertEquals(2, factors.size());
        assertEquals(Long.valueOf(2), factors.get(2L)); // 2^2
        assertEquals(Long.valueOf(1), factors.get(7L)); // 7^1

        // Edge cases
        assertTrue(Primes.getPrimeFactorization(1).isEmpty());
        factors = Primes.getPrimeFactorization(2);
        assertEquals(1, factors.size());
        assertEquals(Long.valueOf(1), factors.get(2L));
    }

    @Test
    public void testIsPrime() {
        // Regular cases
        assertTrue(Primes.isPrime(2));
        assertTrue(Primes.isPrime(3));
        assertFalse(Primes.isPrime(4));

        // Edge cases
        assertFalse(Primes.isPrime(1)); // Not prime
        assertFalse(Primes.isPrime(0)); // Not prime
        assertTrue(Primes.isPrime(97)); // Large prime
        assertFalse(Primes.isPrime(100)); // Composite
    }

    @Test
    public void testSieveOfEratosthenes() {
        // Regular cases
        assertTrue(Primes.sieveOfEratosthenes(2));
        assertTrue(Primes.sieveOfEratosthenes(3));
        assertFalse(Primes.sieveOfEratosthenes(4));

        // Edge cases
        assertFalse(Primes.sieveOfEratosthenes(1)); // 1 is not prime
        assertTrue(Primes.sieveOfEratosthenes(97)); // Large prime
        assertFalse(Primes.sieveOfEratosthenes(100)); // Composite
    }

    @Test
    public void testMillerRabinTest() {
        // Regular cases
        assertTrue(Primes.millerRabinTest(2));
        assertTrue(Primes.millerRabinTest(3));
        assertFalse(Primes.millerRabinTest(4));

        // Edge cases
        assertFalse(Primes.millerRabinTest(1)); // Not prime
        assertTrue(Primes.millerRabinTest(97)); // Large prime
        assertFalse(Primes.millerRabinTest(100)); // Composite
    }
}
