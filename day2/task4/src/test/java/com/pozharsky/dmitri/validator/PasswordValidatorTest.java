package com.pozharsky.dmitri.validator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PasswordValidatorTest {
    PasswordValidator passwordValidator;
    String validPassword;
    String invalidPassword;

    @BeforeClass
    public void setUp() {
        passwordValidator = new PasswordValidator();
        validPassword = "56789Add";
        invalidPassword = "789Add";
    }

    @AfterClass
    public void tearDown() {
        passwordValidator = null;
        validPassword = null;
        invalidPassword = null;
    }

    @Test
    public void testValidatePasswordAndReturnTrue() {
        boolean actual = passwordValidator.validatePassword(validPassword);
        assertTrue(actual);
    }

    @Test
    public void testValidatePasswordAndReturnFalse() {
        boolean actual = passwordValidator.validatePassword(invalidPassword);
        assertFalse(actual);
    }
}