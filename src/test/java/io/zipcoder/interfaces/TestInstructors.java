package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testGetInstance() {
        Instructors i = Instructors.getInstance();
        Person dolio = i.findById(2);

        Assert.assertEquals("Dolio", dolio.getName());
    }
}