package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void studentsInSingletonTest(){
    Integer expected = 5;
    Integer actual = Students.getInstance().getCount();
    Assert.assertEquals(expected,actual);
    }
}
