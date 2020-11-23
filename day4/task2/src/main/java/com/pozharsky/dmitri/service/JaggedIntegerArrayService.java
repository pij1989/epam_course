package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.IntegerArray;
import com.pozharsky.dmitri.entity.JaggedIntegerArray;
import com.pozharsky.dmitri.entity.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class JaggedIntegerArrayService {
    private static final Logger logger = LogManager.getLogger(JaggedIntegerArrayService.class);
    private IntegerArrayService integerArrayService = new IntegerArrayService();

    public void bubleSortByMaxElementInLine(JaggedIntegerArray jaggedIntegerArray, Order order) {
        switch (order) {
            case ASCENDING: {
                bubleSortByMaxElementInLineAsc(jaggedIntegerArray.getIntegerArrays());
                break;
            }
            case DESCENDING: {
                bubleSortByMaxElementInLineDesc(jaggedIntegerArray.getIntegerArrays());
                break;
            }
            default: {
                String msg = "Unknown order value " + order;
                logger.fatal(msg);
                throw new IllegalStateException(msg);
            }
        }
    }

    private void bubleSortByMaxElementInLineAsc(IntegerArray[] integerArrays) {
        for (int i = integerArrays.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int previous = integerArrayService.max(integerArrays[j]);
                int next = integerArrayService.max(integerArrays[j + 1]);
                sortAsc(integerArrays, j, j + 1, previous, next);
            }
        }
    }

    private void bubleSortByMaxElementInLineDesc(IntegerArray[] integerArrays) {
        for (int i = integerArrays.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int previous = integerArrayService.max(integerArrays[j]);
                int next = integerArrayService.max(integerArrays[j + 1]);
                sortDesc(integerArrays, j, j + 1, previous, next);
            }
        }
    }

    private void sortAsc(IntegerArray[] integerArrays, int previousIndex, int nextIndex, int previous, int next) {
        if (previous > next) {
            swap(integerArrays, previousIndex, nextIndex);
        }
    }

    private void sortDesc(IntegerArray[] integerArrays, int previousIndex, int nextIndex, int previous, int next) {
        if (previous < next) {
            swap(integerArrays, previousIndex, nextIndex);
        }
    }

    private void swap(IntegerArray[] integerArrays, int previousIndex, int nextIndex) {
        IntegerArray temp = integerArrays[previousIndex];
        integerArrays[previousIndex] = integerArrays[nextIndex];
        integerArrays[nextIndex] = temp;
    }
}
