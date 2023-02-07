package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)

public class UserRegistrationParamterizedTest {
    private String actualResult;
    private boolean expectedResult;
    private UserRegImplemtation userinput;
    public UserRegistrationParamterizedTest(String actualResult, boolean expectedResult) {
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
    }
    @Before
    public void init() {
        userinput = new UserRegImplemtation();
    }
    @Parameterized.Parameters
    public static Collection emailParamImput() {
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true}, {"abc-100@abc.net", true},
                {"abc.100@yahoo.com", true},{"abc.100@abc.com.au", true},
                {"abc111@abc.com", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}, {"abc", false},{"abc@.com.my", false},
                {"abc123@gmail.a", false},{"abc123@.com", false},{".abc@abc.com", false},
                {"abc()*@gmail.com", false},{"abc123@.com.com", false},{"abc@%*.com", false},
                {"abc..2002@gmail.com", false},{"abc.@gmail.com", false},{"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},{"abc@gmail.com.aa.au", false}});
    }
    @Test
    public void testEmail() {
        assertEquals(expectedResult, userinput.valdateEmail(actualResult));
    }
}

