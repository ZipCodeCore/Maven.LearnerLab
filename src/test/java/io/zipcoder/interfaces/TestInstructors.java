package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstanceOfInstructor() {
        // given
        Instructors instructors = Instructors.getInstance();
        instructors.add(new Instructor(12345678));
        int expected =  4;
        int actual = instructors.getArray().length;
        //then
        Assert.assertEquals(expected, actual);
    }
}

