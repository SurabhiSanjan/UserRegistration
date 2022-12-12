package com.bridgelabz;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class RegistrationTest extends TestCase {

    public RegistrationTest(String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( RegistrationTest.class );
    }
    public void testApp()
    {
        assertTrue( true );
    }
}

