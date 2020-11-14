package com.pozharsky.dmitri.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Garage {
    private Car[] cars;

    public Garage(Car... cars) {
        this.cars = cars;
    }

    public List<Car> findCarByMark(String mark) {
        List<Car> list = new LinkedList<>();
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (car.getMark().equals(mark)) {
                list.add(car);
            }
        }
        return list.size() != 0 ? list : null;
    }

    public List<Car> findCarByModelAndExploitationPeriodGt(String model, int period) {
        List<Car> list = new LinkedList<>();
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if ((car.getModel().equals(model)) && (year - car.getYearManufacture() > period)) {
                list.add(car);
            }
        }
        return list.size() != 0 ? list : null;
    }

    public List<Car> findCarByYearManufactureAndPriceGt(int year, double price) {
        List<Car> list = new LinkedList<>();
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (car.getYearManufacture() == year && car.getPrice() > price) {
                list.add(car);
            }
        }
        return list.size() != 0 ? list : null;
    }
}
