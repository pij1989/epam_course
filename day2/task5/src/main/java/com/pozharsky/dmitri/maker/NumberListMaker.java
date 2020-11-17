package com.pozharsky.dmitri.maker;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberListMaker {
    private static final String REG_COMMA = ",";

    public List<Integer> makeNumberList(String value) {
        String[] values = value.split(REG_COMMA);
        return Arrays.stream(values)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
