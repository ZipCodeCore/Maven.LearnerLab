package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {


    @Test
    public void testSingleton () {
        Students testSingleton = Students.getInstance();
        Integer expected = 35;
        Assert.assertEquals(expected, testSingleton.count());
    }
}
