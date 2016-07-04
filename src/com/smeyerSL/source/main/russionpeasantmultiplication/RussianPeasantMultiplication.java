package com.smeyerSL.source.main.russionpeasantmultiplication;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RussianPeasantMultiplication {

    public RussianPeasantMultiplication() {

    }

    public Long multiply(Long x, Long y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Russian peasant multiplication only applies to natural numbers");
        }
        Map<Long, Long> numbersMap = generateNumbersMap(x, y);
        return foldNumbersMap(numbersMap);
    }

    public Map<Long, Long> generateNumbersMap(Long x, Long y) {
        Map<Long, Long> numbersMap = new HashMap<>();

        do {
            numbersMap.put(x,y);
            x = x / 2;
            y = y * 2;
        } while(x >= 1);

        return numbersMap;
    }

    public Long foldNumbersMap(Map<Long, Long> numbersMap) {
        return numbersMap
                .entrySet()
                .stream()
                .filter(p -> p.getKey() % 2 != 0)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()))
                .values()
                .stream()
                .mapToLong(Number::longValue)
                .sum();
    }
}