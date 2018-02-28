package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void test(){
        Students students = Students.getINSTANCE();
        int actual = students.getCount();
        Assert.assertEquals(10, actual);
    }
}
