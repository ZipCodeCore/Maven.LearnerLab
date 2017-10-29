package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestStudents {

    @Test
    public void testStudents() {

        // Comparing the hash codes of two instances of
        // Students to see if they refer to the same object

        int expected = Students.getInstance().hashCode();
        int actual = Students.getInstance().hashCode();

        Assert.assertEquals(expected, actual);
    }
}
