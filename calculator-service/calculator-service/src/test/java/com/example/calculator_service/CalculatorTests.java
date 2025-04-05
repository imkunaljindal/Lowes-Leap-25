package com.example.calculator_service;

import org.junit.jupiter.api.*;

public class CalculatorTests {

    Calculator c = new Calculator();

    @BeforeAll
    public static void setup() {
        System.out.println("Executed before all tests");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("Executed after all tests");
    }

    @BeforeEach
    public void prepareInput() {
        System.out.println("Executed before each test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Executed after each test");
    }

    @Test
    public void whenNumsPositive_thenReturnPositive() {
        int a = 5;
        int b = 10;
        int expected = 15;
        int actual = c.add(a,b);
        System.out.println("Test 1");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void whenNumIsEven_thenReturnTrue() {
        boolean actual = c.isEven(10);
        System.out.println("Test 2");
        Assertions.assertTrue(actual);
    }

    @Test
    public void whenNumIsOdd_thenReturnFalse() {
        boolean actual = c.isEven(11);
        System.out.println("Test 3");
        Assertions.assertFalse(actual);
    }


}
