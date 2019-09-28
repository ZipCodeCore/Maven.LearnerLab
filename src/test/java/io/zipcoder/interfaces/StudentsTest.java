package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testGetINSTANCEOfOneStudentById() {
        String expected = "katrina";
        String actual = Students.getINSTANCE().findById(899).getName();
        Assert.assertEquals(expected, actual);
    }

}

