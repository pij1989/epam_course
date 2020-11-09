package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.constant.Digit;

public class NumberService {

    public int defineLastDigitSquareNumber(Digit lastDigitNumber) {
        switch (lastDigitNumber) {
            case ZERO:
                return 0;
            case ONE:
            case NINE:
                return 1;
            case TWO:
            case EIGHT:
                return 4;
            case THREE:
            case SEVEN:
                return 9;
            case FOUR:
            case SIX:
                return 6;
            case FIVE:
                return 5;
            default:
                throw new IllegalStateException("Unknown enumeration value " + lastDigitNumber);
        }
    }

    public int getLastDigitNumber(int number) {
        return number % 10;
    }
}
