package io.zipcoder.interfaces.classes;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void TestInstructors(){
        Instructors test = Instructors.getInstance();
        String expected = "Tariq Hook";

        Instructor testInstructor = (Instructor)test.findById(0);
        String actual = testInstructor.getName();

        Assert.assertEquals(expected,actual);
    }
}
