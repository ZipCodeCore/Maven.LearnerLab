package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void studentsInSingletonTest(){
        String expected = "Madeline";
        Person studentTest = Students.getInstance().findById(1000);
        Assert.assertEquals(expected, studentTest.getName());
    }
}
