package com.pozharsky.dmitri.report;

import com.pozharsky.dmitri.entity.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CarReport {
    private static final Logger logger = LogManager.getLogger(CarReport.class);

    public void printCars(List<Car> cars) {
        logger.info("Cars: " + cars);
    }
}
