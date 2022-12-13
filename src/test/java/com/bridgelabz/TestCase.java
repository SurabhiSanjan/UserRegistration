package com.bridgelabz;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class TestCase extends UserRegistration {

        @Test
        public void NameTest(){
            Assert.assertEquals(true, testFirstName("Surabhi") );
        }

        @Test
        public void LastNameTest(){
            Assert.assertEquals(true, testLastName("Sanjan") );
        }
        @Test
        public void EmailTest(){
            Assert.assertEquals(true, testEmailAddress("surabhisanjan@gmail.com") );
        }
        @Test
        public void PhoneTest(){
            Assert.assertEquals(true, testMobileNumber("+91 8544370256") );
        }
        @Test
        public void PasswordTest(){
            Assert.assertEquals(true, testPassword("abc@123A") );
        }

    }
