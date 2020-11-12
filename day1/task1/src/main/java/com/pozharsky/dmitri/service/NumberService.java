package com.pozharsky.dmitri.service;

public class NumberService {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;

    public int defineLastDigitSquareNumber(int number) {
        return searchLastDigitSquareNumber(searchLastDigitNumber(number));
    }

    private int searchLastDigitSquareNumber(int digit) {
        switch (digit) {
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
                throw new IllegalStateException("Unknown digit value " + digit);
        }
    }

    private int searchLastDigitNumber(int number) {
        return number >= -9 && number <= 9 ? Math.abs(number) : Math.abs(number % 10);
    }
}
