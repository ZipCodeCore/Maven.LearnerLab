package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test() {


        long[] expectedInstructors = {123, 456, 789};
        Instructors actualInstructors = Instructors.getInstance();
        for (int p = 0; p <= expectedInstructors.length; p++) {

            Person actualInstructor = actualInstructors.findById(expectedInstructors[p]);

            Assert.assertTrue(actualInstructor != null);


        }

    }

}
