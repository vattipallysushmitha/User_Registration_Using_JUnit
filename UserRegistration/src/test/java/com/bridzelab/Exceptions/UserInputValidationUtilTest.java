package com.bridzelab.Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserInputValidationUtilTest
{

        UserRegistrationCheck usercheck = new UserRegistrationCheck();
        @Test
        public void firstName_Should_returnTrue()
        {
            String firstName = "Vengalreddy";
            boolean value = usercheck.firstName(firstName);
            Assertions.assertTrue(value);
        }
        @Test
        public void firstName_Should_returnFalse()
        {
            String firstName = "vattipally";
            boolean value = usercheck.firstName(firstName);
            Assertions.assertFalse(value);

        }
        @Test
        public void lastName_Should_returnTrue()
        {
            String lastName = "Sushmitha";
            boolean value = usercheck.lastName(lastName);
            Assertions.assertTrue(value);
        }
        @Test
        public void lastName_Should_returnFalse()
        {
            String lastName = "thasvika";
            boolean value = usercheck.lastName(lastName);
            Assertions.assertFalse(value);

        }
        @Test
        public void email_Should_returnTrue()
        {
            String email = "xyz@bl.co.in";
            boolean value = usercheck.email(email);
            Assertions.assertTrue(value);
        }
        @Test
        public void email_Should_returnFalse()
        {
            String email = "vatipally@inda";
            boolean value = usercheck.email(email);
            Assertions.assertFalse(value);

        }
        @Test
        public void mobileNum_Should_returnTrue()
        {
            String mobileNum = "91 1234567890";
            boolean value = usercheck.mobileNumber(mobileNum);
            Assertions.assertTrue(value);
        }
        @Test
        public void mobileNum_Should_returnFalse()
        {
            String mobileNum = "85067";
            boolean value = usercheck.mobileNumber(mobileNum);
            Assertions.assertFalse(value);

        }
        @Test
        public void password_Should_returnTrue()
        {
            String password = "HelloHi@12";
            boolean value = usercheck.password(password);
            Assertions.assertTrue(value);
        }
        @Test
        public void password_Should_returnFalse()
        {
            String password = "sushmitha";
            boolean value = usercheck.password(password);
            Assertions.assertFalse(value);

        }
}