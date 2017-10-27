package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){
        Students.getInstance();

        int expected = 25;
        int actual = Students.getCount();

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(Students.getArray()[0] instanceof Student);
    }

}
