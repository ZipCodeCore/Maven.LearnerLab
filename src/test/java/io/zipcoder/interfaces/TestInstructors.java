package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test

    public void testInstructors() {


        //: Given

        Instructors instructors = new Instructors();
        Instructor instructor = new Instructor(1, "Tariq");
        Instructor instructor2 = new Instructor(1, "Lean");
        instructors.getInstance().add(instructor);
        instructors.getInstance().add(instructor2);

        int expected;
        expected = 2;

        int actual = instructors.getInstance().getCount();

        //:then
        Assert.assertEquals(expected, actual);
    }
}
