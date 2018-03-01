package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudents {

    @Test
    public void testSingleton(){
        Students students = Students.getInstance();
        String expected = "Carolynn";
        String actual = students.findById(102).getName();
        Assert.assertEquals(expected, actual);
    }
}
