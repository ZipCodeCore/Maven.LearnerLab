package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test

    public void testInstructors() {


        //: Given

        Instructors instructors = Instructors.getInstance();

        int expected = 3;

        int actual = instructors.getInstance().getCount();

        //:then
        Assert.assertEquals(expected, actual);
    }
}
