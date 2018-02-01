package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors{

    @Test
    public void TestInstructors(){

        Instructors allInstructors = Instructors.getInstance();

        int expected = 4;
        int actual = allInstructors.getCount();


        Assert.assertEquals(expected,actual,0);

    }
}

