package com.smeyerSL.source.main.happynumbers;

public class HappyNumbers {

    public HappyNumbers() {
    }

    public boolean isMyNumberHappy(final int number) {
        System.out.println("Checking happyness for " + number);
        int newNumber = number;
        while (newNumber != 1 && newNumber != 4 && newNumber > 0) {
            newNumber = sumupSquaredDigits(newNumber);
        }

        if (newNumber == 1) {
            System.out.println(number + " is happy");
            return true;
        }
        System.out.println(number + " isn't happy");
        return false;
    }

    public int sumupSquaredDigits(final int number) {
        String numberAsString = Integer.toString(number);
        int result = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt(Character.toString(numberAsString.charAt(i)));
            result += digit * digit;
        }
        return result;
    }

}
