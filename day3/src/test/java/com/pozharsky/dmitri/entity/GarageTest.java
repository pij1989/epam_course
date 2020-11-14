package com.pozharsky.dmitri.entity;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class GarageTest {
    Garage garage;
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    Car car5;

    @BeforeMethod
    public void setUp() {
        car1 = new Car(1, "BMW", "X5", 2009, "black", 15000, "8682АМ-7");
        car2 = new Car(2, "Audi", "A6", 2015, "black", 17000, "7375АК-7");
        car3 = new Car(3, "Audi", "A6", 2017, "black", 19000, "8375АК-7");
        car4 = new Car(4, "Volvo", "S40", 2015, "red", 12000, "8775АК-7");
        car5 = new Car(4, "Citroen", "C5", 2012, "blue", 10000, "9775АК-7");
        garage = new Garage(car1, car2, car3, car4, car5);
    }

    @AfterMethod
    public void tearDown() {
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
        List<Car> actual = garage.findCarByMark("Audi");
        assertEquals(actual, expect);
    }

    @Test
    public void testFindCarByModelAndExploitationPeriodGt() {
        List<Car> expect = List.of(car2, car3);
        List<Car> actual = garage.findCarByModelAndExploitationPeriodGt("A6", 2);
        assertEquals(actual, expect);
    }

    @Test
    public void testFindCarByYearManufactureAndPriceGt() {
        List<Car> expect = List.of(car2, car4);
        List<Car> actual = garage.findCarByYearManufactureAndPriceGt(2015, 9000);
        assertEquals(actual, expect);
    }
}