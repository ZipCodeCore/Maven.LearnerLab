package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testingSingleton () {
        Instructor leon = new Instructor();
        Instructor dolio = new Instructor();
        Integer expected = 2;

        Instructors.getInstance().add(leon);
        Instructors.getInstance().add(dolio);
        Integer actual = Instructors.getInstance().count();

        Assert.assertEquals(expected, actual);
    }
}
