package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestInstructors {

    @Test
    public void testGetInstance_IsSingleton() {

        int expected = Instructors.getInstance().hashCode();
        int actual = Instructors.getInstance().hashCode();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetInstance_Populated() {

        int expected = 3;
        int actual = Instructors.getInstance().getArray().length;

        Assert.assertEquals(expected, actual);
    }
}
