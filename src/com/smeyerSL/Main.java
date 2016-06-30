package com.smeyerSL;

import com.smeyerSL.source.main.fizzbuzz.FizzBuzz;
import com.smeyerSL.source.main.russionpeasantmultiplication.RussianPeasantMultiplication;

public class Main {

    public static void main(String[] args) {
        new FizzBuzz().loopThroughNumbers();
        new RussianPeasantMultiplication().multiply(12L, 5L);
    }
}
