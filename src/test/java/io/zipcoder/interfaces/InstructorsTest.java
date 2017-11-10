package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class InstructorsTest {

    @Test
    public void testInstructors(){
        Instructors instructors = Instructors.getInstance();
        int expected = 3;
        int actual = instructors.getCount();
        Assert.assertEquals(expected, actual);
    }
}