package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {


        long[] expectedStudents = {123, 456, 789};
        Students actualStudents = Students.getInstance();
        for (int p = 0; p < expectedStudents.length; p++) {

            Person actualStudent = actualStudents.findById(expectedStudents[p]);


        }

        Assert.assertTrue(actualStudents != null);

    }

}
