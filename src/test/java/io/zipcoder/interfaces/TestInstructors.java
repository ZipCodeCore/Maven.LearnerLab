package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test(){
        Instructors.getInstance();

        int expected = 5;
        int actual = Instructors.getCount();

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(Instructors.getArray()[0] instanceof Instructor);
    }

}