package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
    UserRegImplemtation userreg = new UserRegImplemtation();

    @Test
    public void checkFirstName() {
        String testFName = "Swati";
        assertEquals(true, userreg.validateFName(testFName));
    }

    @Test
    public void checkLName() {
        String testLName = "Sinha";
        assertEquals(true, userreg.validateLname(testLName));
    }

    @Test
    public void checkEmail() {
        String testEmail = "swati@gmail.com";
        assertEquals(true, userreg.valdateEmail(testEmail));
    }

    @Test
    public void checkphoneNumber() {
        String testPhoneNumber = "91 9066548034";
        assertEquals(true, userreg.validatephoneNumber(testPhoneNumber));
    }

    @Test
    public void checkPwd() {
        String testPwd = "S@12fgunk";
        assertEquals(true, userreg.validatePwd(testPwd));
    }
}
