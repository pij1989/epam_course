package com.pozharsky.dmitri.entity;

import com.pozharsky.dmitri.exception.CarException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Garage implements Iterable<Car> {
    private List<Car> cars;

    public Garage() {
        this.cars = new ArrayList<>();
    }

    public Garage(Car... cars) {
        this.cars = Arrays.stream(cars)
                .collect(Collectors.toList());
    }

    public boolean addCar(Car car) throws CarException {
        if (car == null) {
            throw new CarException("You can not add zero car");
        }
        return cars.add(car);
    }

    public Car getCar(int index) throws CarException {
        if (index < 0 || index >= cars.size()) {
            throw new CarException("Garage can not have place less then zero and more then capacity of garage");
        }
        return cars.get(index);
    }

    public Car removeCar(int index) throws CarException {
        if (index < 0 || index >= cars.size()) {
            throw new CarException("Car with given index does not locate in garage");
        }
        return cars.remove(index);
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Garage garage = (Garage) o;

        return cars != null ? cars.equals(garage.cars) : garage.cars == null;
    }

    @Override
    public int hashCode() {
        return cars != null ? cars.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Garage{");
        sb.append("cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }
}
