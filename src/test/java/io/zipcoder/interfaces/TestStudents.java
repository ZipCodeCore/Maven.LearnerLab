package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudents {

    @Test
    public void testStudents(){
        StringBuilder testStudents = new StringBuilder();
        testStudents.append(Students.getInstance().getArray()[0].getId());  // Eric id = 1
        testStudents.append(Students.getInstance().getArray()[1].getId());  // Gio = 2
        testStudents.append(Students.getInstance().getArray()[2].getId());  // Keith = 3

        String expected = "123";    // id #'s
        String actual = testStudents.toString();

        Assert.assertEquals(expected, actual);

    }




}