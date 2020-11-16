package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Car;
import com.pozharsky.dmitri.entity.Garage;
import com.pozharsky.dmitri.entity.Mark;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CarService {

    public List<Car> findCarByMark(Mark mark, Garage garage) {
        List<Car> list = new LinkedList<>();
        for (Car car : garage) {
            if (car.getMark().equals(mark)) {
                list.add(car);
            }
        }
        return list.size() != 0 ? list : null;
    }

    public List<Car> findCarByModelAndExploitationPeriodGt(String model, int period, Garage garage) {
        List<Car> list = new LinkedList<>();
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        for (Car car : garage) {
            if ((car.getModel().equals(model)) && (year - car.getYearManufacture() > period)) {
                list.add(car);
            }
        }
        return list.size() != 0 ? list : null;
    }

    public List<Car> findCarByYearManufactureAndPriceGt(int year, double price, Garage garage) {
        List<Car> list = new LinkedList<>();
        for (Car car : garage) {
            if (car.getYearManufacture() == year && car.getPrice() > price) {
                list.add(car);
            }
        }
        return list.size() != 0 ? list : null;
    }
}
