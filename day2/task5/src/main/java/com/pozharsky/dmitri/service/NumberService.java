package com.pozharsky.dmitri.service;

import java.util.List;

public class NumberService {
    public int sumInteger(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public long multipleInteger(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a, b) -> a * b)
                .longValue();
    }
}
