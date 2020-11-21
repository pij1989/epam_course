package com.pozharsky.dmitri.entity;

import com.pozharsky.dmitri.excepton.ArrayIntegerException;

import java.util.Arrays;
import java.util.List;

public class ArrayInteger {
    private static final int DEFAULT_CAPACITY = 14;
    private int size;
    private Integer[] array;

    public ArrayInteger() {
        this.array = new Integer[DEFAULT_CAPACITY];
    }

    public ArrayInteger(Integer... integers) {
        this.array = integers;
        this.size = integers.length;
    }

    public ArrayInteger(List<Integer> list) {
        this.array = list.toArray(new Integer[0]);
        this.size = array.length;
    }

    public Integer getInteger(int index) throws ArrayIntegerException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIntegerException("Index less then zero or more then array lenght");
        }
        return array[index];
    }

    public void addInteger(Integer value) throws ArrayIntegerException {
        if (value == null) {
            throw new ArrayIntegerException("Add value can not be null");
        }
        if (size == array.length) {


        }
    }

   /* public Integer[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(Integer[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayInteger that = (ArrayInteger) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayInteger{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
