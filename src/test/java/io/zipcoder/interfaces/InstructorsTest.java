package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getCountOfInstructorsTest() {
        Instructors i = Instructors.getInstance();
        int expected = i.getCount();
        int actual = InstructorNames.values().length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameOfInstructorsTest() {
        Instructors i = Instructors.getInstance();
        Person[] expected = i.getPersonAsArray();
        String expectedName = expected[2].getName();
        String actualName = String.valueOf(InstructorNames.WILHAM);
        Assert.assertEquals(expectedName, actualName);
    }
}