package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        Instructors instructors = Instructors.getINSTANCE();
        int expected = 3;
        int actual = instructors.getCount();
        Assert.assertEquals(expected, actual);
    }
}
