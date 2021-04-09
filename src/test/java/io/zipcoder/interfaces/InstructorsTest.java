package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {
    @Test
    public void instructorsInSingletonTest(){
        Integer expected = 6;
        Integer actual = Instructors.getInstance().getCount();
        Assert.assertEquals(expected,actual);
    }
}
