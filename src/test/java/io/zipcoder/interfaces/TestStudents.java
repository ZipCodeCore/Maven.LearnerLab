package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStudents{

    @Test
    public void TestStudents(){

        Students allStudents = Students.getInstance();

        int expected = 28;
        int actual = allStudents.getCount();

        Assert.assertEquals(expected,actual,0);

    }
}
