package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class InstructorsTest {

    @Test
    public void TestInstructors () {
        Instructors instructors = Instructors.getInstance();
        int expected = 3;
        int actual = instructors.getCount();
        Assert.assertEquals(expected, actual);
    }
}
