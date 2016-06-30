package com.smeyerSL.source.main.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZBUZZ = "fizzbuzz";
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int NUMBER_OF_ITERATIONS = 100;


    public FizzBuzz() {
    }

    public void loopThroughNumbers() {
        for (int i = 1; i <= NUMBER_OF_ITERATIONS; i++) {
            String expressionForNumber = getStringExpressionForNumber(i);
            System.out.println(expressionForNumber);
        }
    }

    public String getStringExpressionForNumber(Integer number) {
        int moduloFor3 = number % 3;
        int moduloFor5 = number % 5;
        String stringExpression = number.toString();

        if (moduloFor3 == 0 && moduloFor5 == 0) {
            stringExpression = FIZZBUZZ;
        } else if (moduloFor3 == 0) {
            stringExpression = FIZZ;
        } else if  (moduloFor5 == 0) {
            stringExpression = BUZZ;
        }
        return stringExpression;
    }
}
