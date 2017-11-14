package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class InstructorTest {

    Instructors tariq = Instructors.getInstance();

    @Test
    public void test(){

        int expected = 5;
        int actual = Instructors.getInstance().instructorList.size();

        Assert.assertEquals(expected, actual);

    }
}
