package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestInstructors {

    @Test
    public void getInstanceTest() {
        String expected = "[Tariq: 10]";
        String actual = Arrays.toString(Instructors.getInstance().getArray());

        Assert.assertEquals(expected, actual);
    }
}
