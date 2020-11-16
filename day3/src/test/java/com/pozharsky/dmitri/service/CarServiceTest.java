package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Car;
import com.pozharsky.dmitri.entity.Color;
import com.pozharsky.dmitri.entity.Garage;
import com.pozharsky.dmitri.entity.Mark;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class CarServiceTest {
    CarService carService;
    Garage garage;
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    Car car5;

    @BeforeMethod
    public void setUp() {
        carService = new CarService();
        car1 = new Car(1, Mark.BMW, "X5", 2009, Color.BLACK, 15000, "8682АМ-7");
        car2 = new Car(2, Mark.AUDI, "A6", 2015, Color.BLACK, 17000, "7375АК-7");
        car3 = new Car(3, Mark.AUDI, "A6", 2017, Color.BLACK, 19000, "8375АК-7");
        car4 = new Car(4, Mark.VOLVO, "S40", 2015, Color.RED, 12000, "8775АК-7");
        car5 = new Car(4, Mark.CITROEN, "C5", 2012, Color.RED, 10000, "9775АК-7");
        garage = new Garage(car1, car2, car3, car4, car5);
    }

    @AfterMethod
    public void tearDown() {
        carService = null;
        garage = null;
        car1 = null;
        car2 = null;
        car3 = null;
        car4 = null;
        car5 = null;
    }

    @Test
    public void testFindCarByMark() {
        List<Car> expect = List.of(car2, car3);
        List<Car> actual = carService.findCarByMark(Mark.AUDI, garage);
        assertEquals(actual, expect);
    }

    @Test
    public void testFindCarByModelAndExploitationPeriodGt() {
        List<Car> expect = List.of(car2, car3);
        List<Car> actual = carService.findCarByModelAndExploitationPeriodGt("A6", 2, garage);
        assertEquals(actual, expect);
    }

    @Test
    public void testFindCarByYearManufactureAndPriceGt() {
        List<Car> expect = List.of(car2, car4);
        List<Car> actual = carService.findCarByYearManufactureAndPriceGt(2015, 9000, garage);
        assertEquals(actual, expect);
    }
}