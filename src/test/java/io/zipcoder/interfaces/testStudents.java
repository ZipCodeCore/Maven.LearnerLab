package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testStudents {

    @Test
    public void TestSingleton() {
        Students students = Students.getInstance();
        int expected = students.getCount();
        int actual = 24;
        Assert.assertEquals(expected, actual);
    }
}
