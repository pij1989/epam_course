package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Square;

public class SquareService {

    public double defineSquareAreaInCircle(Square squareAroundCircle) {
        return squareAroundCircle.getSquare() / 2;
    }

}
