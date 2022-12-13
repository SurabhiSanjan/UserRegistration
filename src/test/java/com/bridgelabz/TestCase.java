package com.bridgelabz;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class TestCase {
UserRegistration ur = new UserRegistration();
        @Test
        public void NameTest(){
            Assert.assertEquals(true, ur.testFirstName("Surabhi") );
        }
        @Test
        public void LastNameTest(){
            Assert.assertEquals(true, ur.testLastName("Sanjan") );
        }
        @Test
        public void EmailTest(){
            Assert.assertEquals(true, ur.testEmailAddress("surabhisanjan@gmail.com") );
        }
        @Test
        public void PhoneTest(){
            Assert.assertEquals(true, ur.testMobileNumber("+91 8544370256") );
        }
        @Test
        public void PasswordTest(){
            Assert.assertEquals(true, ur.testPassword("abc@123A") );
        }
    @Test
    public void NameTest2(){
        Assert.assertEquals(true, ur.testFirstName("Akanksha") );
    }
    @Test
    public void LastNameTest2(){
        Assert.assertEquals(true, ur.testLastName("Pathak") );
    }
    @Test
    public void EmailTest2(){
        Assert.assertEquals(true, ur.testEmailAddress("novia@gmail.com") );
    }
    @Test
    public void PhoneTest2(){
        Assert.assertEquals(true, ur.testMobileNumber("+91 7667428280") );
    }
    @Test
    public void PasswordTest2(){
        Assert.assertEquals(true, ur.testPassword("novia@1A") );
    }

    }
