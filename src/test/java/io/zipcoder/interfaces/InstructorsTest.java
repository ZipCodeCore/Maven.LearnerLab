package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void testGetINSTANCE() {
        String expected = "Nhu";
        String actual = Instructors.getINSTANCE().findById(500).getName();
        Assert.assertEquals(expected, actual);
    }
}