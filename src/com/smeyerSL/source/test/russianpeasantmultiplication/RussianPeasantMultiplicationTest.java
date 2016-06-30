package com.smeyerSL.source.test.russianpeasantmultiplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.smeyerSL.source.main.russionpeasantmultiplication.RussianPeasantMultiplication;

public class RussianPeasantMultiplicationTest {

    private RussianPeasantMultiplication russianPeasantMultiplication;

    @Before
    public void setup() {
        this.russianPeasantMultiplication = new RussianPeasantMultiplication();
    }

    @Test
    public void multiplyTest() {
        assertTrue(100L == this.russianPeasantMultiplication.multiply(10L, 10L));
        assertTrue(527L == this.russianPeasantMultiplication.multiply(31L, 17L));
        assertTrue(4650L == this.russianPeasantMultiplication.multiply(75L, 62L));
    }

    public void multiplyWithZeroTest() {
        //TODO
    }

    public void multiplyWithNegativeValuesTest() {
        //TODO
    }

    @Test
    public void generateNumbersMapForPositiveValuesTest() {
        Map<Long, Long> actualMap = this.russianPeasantMultiplication.generateNumbersMap(31L, 17L);
        Map<Long, Long> expectedMap = new HashMap<>();
        expectedMap.put(31L, 17L);
        expectedMap.put(15L, 34L);
        expectedMap.put(7L, 68L);
        expectedMap.put(3L, 136L);
        expectedMap.put(1L, 272L);
        assertEquals(expectedMap, actualMap);

        actualMap = this.russianPeasantMultiplication.generateNumbersMap(32L, 17L);
        expectedMap = new HashMap<>();
        expectedMap.put(32L, 17L);
        expectedMap.put(16L, 34L);
        expectedMap.put(8L, 68L);
        expectedMap.put(4L, 136L);
        expectedMap.put(2L, 272L);
        expectedMap.put(1L, 544L);
        assertEquals(expectedMap, actualMap);
    }

    public void generateNumbersMapForNegativeValuesTest() {
        //TODO
    }

    public void generateNumbersMapWithZeroTest() {
        //TODO
    }

    @Test
    public void foldNumbersMapTest() {
        Map<Long, Long> testMap = new HashMap<>();
        testMap.put(31L, 17L);
        testMap.put(15L, 34L);
        testMap.put(7L, 68L);
        testMap.put(3L, 136L);
        testMap.put(1L, 272L);
        assertTrue(527L == this.russianPeasantMultiplication.foldNumbersMap(testMap));

        testMap = new HashMap<>();
        testMap.put(32L, 17L);
        testMap.put(16L, 34L);
        testMap.put(8L, 68L);
        testMap.put(4L, 136L);
        testMap.put(2L, 272L);
        testMap.put(1L, 544L);
        assertTrue(544L == this.russianPeasantMultiplication.foldNumbersMap(testMap));
    }
}
