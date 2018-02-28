package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestInstructors {

    @Test
    public void getInstanceTest() {
        String expected = "[Tariq: 10, Leon: 11, Kris: 12, Wilhelm: 13, Froilan: 14, Nhu: 15]";
        String actual = Arrays.toString(Instructors.getInstance().getArray());

        Assert.assertEquals(expected, actual);
    }
}
