package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {


    @Test
    public void test1(){
        Person actualInstructor = null;
        Long[] instructorArray = {0L, 1L};
        Instructors actual = Instructors.getInstance();

        for (int i = 0; i < instructorArray.length; i++) {
            actualInstructor = actual.findById(instructorArray[i]);
        }
        Assert.assertTrue(actualInstructor != null);
    }

}
