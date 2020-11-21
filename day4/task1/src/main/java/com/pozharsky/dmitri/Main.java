package com.pozharsky.dmitri;

import com.pozharsky.dmitri.entity.ArrayInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        ArrayInteger integerArray = new ArrayInteger(List.of(1, 2, 3, 4, 5));
        logger.info(integerArray);
        ArrayInteger arrayInteger1 = new ArrayInteger(4, 6, 7, 9);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.size());

    }
}
