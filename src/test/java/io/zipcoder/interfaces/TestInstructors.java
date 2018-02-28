package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test(){
        Instructor nhu = new Instructor("Nhu");
        Assert.assertTrue(nhu instanceof Instructor);
    }
    @Test
    public void testGetInstance(){
        Instructors instructor1 = Instructors.getInstance();
        // in testing a singleton you do not need to use the keyword "new"
        Instructors instructor2 = Instructors.getInstance();
        Assert.assertSame(instructor1, instructor2);
        // assert they are the same not equal
    }
}
