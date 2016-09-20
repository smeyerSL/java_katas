package com.smeyerSL.source.main.wordcount;

public class WordCount {

    public WordCount() {
    }

    public int count(final String text) {
        String newText = text.trim();
        int count = 0;
        boolean whitespace = true;

        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == ' ') {
                whitespace = true;
            } else {
                if (whitespace) {
                    count++;
                    whitespace = false;
                }
            }
        }

        return count;
    }
}
