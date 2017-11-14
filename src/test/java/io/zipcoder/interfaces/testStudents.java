package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testStudents {

    @Test
    public void TestSingleton() {
        Students students = Students.getInstance();
        int expected = 24;
        int actual = students.getCount();
        Assert.assertEquals(expected, actual);
    }
}
