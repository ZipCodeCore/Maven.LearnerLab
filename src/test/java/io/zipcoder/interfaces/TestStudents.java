package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void studentsContainsTest(){
        Students test = Students.getInstance();

        int actual = test.count();
        int expected = 3;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void name() {
    }

    @Test
    public void studentsContainsTest2(){
        Students test = Students.getInstance();
        
    }
}
