package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentsTest {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testStudents() {
        Students s = Students.getInstance();
        Person[] expected = s.getPersonAsArray();
        int count = s.getCount();
        int classSize = StudentNames.values().length;

        Assert.assertEquals(count, classSize);
    }

    @Test
    public void testStudentsGetNames(){

        Students s = Students.getInstance();
        Person[] expected = s.getPersonAsArray();
        String expectedName = expected[0].getName();
        String actual = String.valueOf(StudentNames.VINCE);

        Assert.assertEquals(expectedName, actual);

    }
}