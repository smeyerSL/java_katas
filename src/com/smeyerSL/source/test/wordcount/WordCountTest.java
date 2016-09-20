package com.smeyerSL.source.test.wordcount;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.smeyerSL.source.main.wordcount.WordCount;

public class WordCountTest {

    WordCount wordCount;

    @Before
    public void setUp() {
        this.wordCount = new WordCount();
    }

    @Test
    public void wordCountWordsContainingJustLettersTest() {
        assertEquals(3, wordCount.count("How are you?"));
        assertEquals(0, wordCount.count("   "));
        assertEquals(7, wordCount.count("Thanks, I'm fine. And how about you?"));
    }

}
