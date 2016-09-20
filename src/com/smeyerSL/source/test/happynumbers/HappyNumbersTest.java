package com.smeyerSL.source.test.happynumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.smeyerSL.source.main.happynumbers.HappyNumbers;

public class HappyNumbersTest {

    private HappyNumbers happyNumbers;

    @Before
    public void setUp() {
        this.happyNumbers = new HappyNumbers();
    }

    @Test
    public void sumupSquaredDigitsTest() {
        assertEquals(0, happyNumbers.sumupSquaredDigits(0));
        assertEquals(64, happyNumbers.sumupSquaredDigits(8));
        assertEquals(50, happyNumbers.sumupSquaredDigits(17));
        assertEquals(2, happyNumbers.sumupSquaredDigits(11));
        assertEquals(13, happyNumbers.sumupSquaredDigits(23));
        assertEquals(84, happyNumbers.sumupSquaredDigits(248));
        assertEquals(97, happyNumbers.sumupSquaredDigits(49));
        assertEquals(1, happyNumbers.sumupSquaredDigits(100));
    }

    @Test
    public void isMyNumberHappyTest() {
        assertTrue(happyNumbers.isMyNumberHappy(1));
        assertTrue(happyNumbers.isMyNumberHappy(7));
        assertTrue(happyNumbers.isMyNumberHappy(10));
        assertTrue(happyNumbers.isMyNumberHappy(13));
        assertTrue(happyNumbers.isMyNumberHappy(19));
        assertTrue(happyNumbers.isMyNumberHappy(23));
        assertTrue(happyNumbers.isMyNumberHappy(28));
        assertTrue(happyNumbers.isMyNumberHappy(31));
        assertTrue(happyNumbers.isMyNumberHappy(32));
        assertTrue(happyNumbers.isMyNumberHappy(44));
        assertTrue(happyNumbers.isMyNumberHappy(49));
        assertTrue(happyNumbers.isMyNumberHappy(68));
        assertTrue(happyNumbers.isMyNumberHappy(70));
        assertTrue(happyNumbers.isMyNumberHappy(79));
        assertTrue(happyNumbers.isMyNumberHappy(82));
        assertTrue(happyNumbers.isMyNumberHappy(86));
        assertTrue(happyNumbers.isMyNumberHappy(91));
        assertTrue(happyNumbers.isMyNumberHappy(94));
        assertTrue(happyNumbers.isMyNumberHappy(97));
        assertTrue(happyNumbers.isMyNumberHappy(100));

        assertFalse(happyNumbers.isMyNumberHappy(0));
        assertFalse(happyNumbers.isMyNumberHappy(3));
        assertFalse(happyNumbers.isMyNumberHappy(4));
        assertFalse(happyNumbers.isMyNumberHappy(12));
        assertFalse(happyNumbers.isMyNumberHappy(17));
        assertFalse(happyNumbers.isMyNumberHappy(11));
        assertFalse(happyNumbers.isMyNumberHappy(21));
        assertFalse(happyNumbers.isMyNumberHappy(22));
        assertFalse(happyNumbers.isMyNumberHappy(35));
        assertFalse(happyNumbers.isMyNumberHappy(47));
        assertFalse(happyNumbers.isMyNumberHappy(53));
        assertFalse(happyNumbers.isMyNumberHappy(66));
        assertFalse(happyNumbers.isMyNumberHappy(78));
        assertFalse(happyNumbers.isMyNumberHappy(88));
    }
}