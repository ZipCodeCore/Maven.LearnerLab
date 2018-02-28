package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void testGetInstance() {
        Instructors.getInstance();

        double expected = 5;
        double actual = Instructors.getInstance().getCount();

        Assert.assertEquals(expected, actual, .05);
    }
}