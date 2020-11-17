package com.pozharsky.dmitri.authentication;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PasswordAuthenticationTest {
    PasswordAuthentication passwordAuthentication;
    String correctPassword = "123456Ab";
    String incorrectPassword = "234567Ad";

    @BeforeClass
    public void setUp() {
        passwordAuthentication = new PasswordAuthentication();
    }

    @AfterClass
    public void tearDown() {
        passwordAuthentication = null;
        correctPassword = null;
        incorrectPassword = null;
    }

    @Test
    public void testAuthenticateAndReturnTrue() {
        boolean actual = passwordAuthentication.authenticate(correctPassword);
        assertTrue(actual);
    }

    @Test
    public void testAuthenticateAndReturnFalse() {
        boolean actual = passwordAuthentication.authenticate(incorrectPassword);
        assertFalse(actual);
    }
}