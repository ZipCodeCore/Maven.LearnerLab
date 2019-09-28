package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestStudents {

    @Test
    public void getInstanceTest() {
        String expected = "[Anthony: 1, Bo: 2, Brian: 3, Katrina: 4, Kay: 5]";
        String actual = Arrays.toString(Students.getInstance().getArray());

        Assert.assertEquals(expected, actual);
    }
}
