package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class StudentsTest {

    @Test
    public void testStudents(){
        Students students = Students.getInstance();
        int expected = 28;
        int actual = students.getCount();
        Assert.assertEquals(expected, actual);
    }
}