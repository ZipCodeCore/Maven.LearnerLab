package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudents {

    @Test
    public void testSingleton(){
        Students students = Students.getInstance();
        int expected = 8;
        int actual = students.getCount();
        Assert.assertEquals(expected, actual);
    }
}
