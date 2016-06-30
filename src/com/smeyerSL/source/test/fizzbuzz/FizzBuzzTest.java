package com.smeyerSL.source.test.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.smeyerSL.source.main.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void getStringExpressionForNumberWhichIsMultipleOf3Test() {
        assertEquals("fizz", this.fizzBuzz.getStringExpressionForNumber(3));
        assertEquals("fizz", this.fizzBuzz.getStringExpressionForNumber(6));
        assertEquals("fizz", this.fizzBuzz.getStringExpressionForNumber(12));
        assertEquals("fizz", this.fizzBuzz.getStringExpressionForNumber(36));
        assertEquals("fizz", this.fizzBuzz.getStringExpressionForNumber(87));
    }

    @Test
    public void getStringExpressionForNumberForNumberWhichIsMultipleOf5Test() {
        assertEquals("buzz", this.fizzBuzz.getStringExpressionForNumber(5));
        assertEquals("buzz", this.fizzBuzz.getStringExpressionForNumber(20));
        assertEquals("buzz", this.fizzBuzz.getStringExpressionForNumber(55));
        assertEquals("buzz", this.fizzBuzz.getStringExpressionForNumber(85));
        assertEquals("buzz", this.fizzBuzz.getStringExpressionForNumber(100));
    }

    @Test
    public void getStringExpressionForNumberForNumberWhichIsMultipleOfBoth3And5Test() {
        assertEquals("fizzbuzz", this.fizzBuzz.getStringExpressionForNumber(15));
        assertEquals("fizzbuzz", this.fizzBuzz.getStringExpressionForNumber(30));
        assertEquals("fizzbuzz", this.fizzBuzz.getStringExpressionForNumber(60));
        assertEquals("fizzbuzz", this.fizzBuzz.getStringExpressionForNumber(90));
    }

    @Test
    public void getStringExpressionForNumberWhichIsNoMultipleOf3Or5Test() {
        assertEquals("1", this.fizzBuzz.getStringExpressionForNumber(1));
        assertEquals("4", this.fizzBuzz.getStringExpressionForNumber(4));
        assertEquals("11", this.fizzBuzz.getStringExpressionForNumber(11));
        assertEquals("26", this.fizzBuzz.getStringExpressionForNumber(26));
        assertEquals("44", this.fizzBuzz.getStringExpressionForNumber(44));
        assertEquals("82", this.fizzBuzz.getStringExpressionForNumber(82));
    }
}