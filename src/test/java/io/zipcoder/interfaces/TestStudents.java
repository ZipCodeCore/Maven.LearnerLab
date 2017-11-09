package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudents(){
        Students students = Students.getINSTANCE();
        int expected = 24;
        int actual = students.getCount();
        Assert.assertEquals(expected, actual);
    }
}
