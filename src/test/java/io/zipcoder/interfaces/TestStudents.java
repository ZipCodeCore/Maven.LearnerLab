package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestStudents {

    @Test
    public void testStudents_IsSingleton() {

        // Comparing the hash codes of two instances of
        // Students to see if they refer to the same object

        int expected = Students.getInstance().hashCode();
        int actual = Students.getInstance().hashCode();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudents_Populated() {

        int expected = 28;

        int actual = Students.getInstance().getArray().length;

        Assert.assertEquals(expected, actual);
    }
}
