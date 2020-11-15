package com.pozharsky.dmitri.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArgumentServiceTest {
    ArgumentService argumentService;
    String[] arguments;
    String[] reverseArguments;

    @BeforeMethod
    public void setUp() {
        argumentService = new ArgumentService();
        arguments = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        reverseArguments = new String[]{"ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
    }

    @AfterMethod
    public void tearDown() {
        argumentService = null;
        arguments = null;
        reverseArguments = null;
    }

    @Test
    public void testReverseArguments() {
        String[] actual = argumentService.reverseArguments(arguments);
        assertEquals(actual,reverseArguments);
    }
}
