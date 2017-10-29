package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestInstructors {

    @Test
    public void testGetInstance() {

        int expected = Instructors.getInstance().hashCode();
        int actual = Instructors.getInstance().hashCode();

        Assert.assertEquals(expected, actual);
    }
}
