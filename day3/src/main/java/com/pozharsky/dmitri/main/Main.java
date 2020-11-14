package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.entity.Car;
import com.pozharsky.dmitri.entity.Garage;
import com.pozharsky.dmitri.report.CarReport;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "BMW", "X5", 2009, "black", 15000, "8682АМ-7");
        Car car2 = new Car(2, "Audi", "A6", 2015, "black", 17000, "7375АК-7");
        Car car3 = new Car(3, "Audi", "A6", 2017, "black", 19000, "8375АК-7");
        Car car4 = new Car(4, "Volvo", "S40", 2015, "red", 12000, "8775АК-7");
        Car car5 = new Car(4, "Citroen", "C5", 2012, "blue", 10000, "9775АК-7");
        Garage garage = new Garage(car1, car2, car3, car4, car5);
        CarReport carReport = new CarReport();
        carReport.printCars(garage.findCarByMark("Audi"));
        carReport.printCars(garage.findCarByModelAndExploitationPeriodGt("A6", 2));
        carReport.printCars(garage.findCarByYearManufactureAndPriceGt(2015, 9000));
    }
}
