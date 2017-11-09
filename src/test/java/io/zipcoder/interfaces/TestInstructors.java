package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void allInstructorsTest(){
        Instructors instructors = Instructors.getINSTANCE();
        String[] instructorsNames = {
                "kca83", "nehctuk", "kozman31"
        };
        boolean actual = true;
        String expected = String.valueOf(instructors.contains(instructorsNames));
        Assert.assertTrue(expected, actual);

    }

}
