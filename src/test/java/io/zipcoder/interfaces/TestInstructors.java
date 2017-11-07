package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.Instructor;
import io.zipcoder.interfaces.Class.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void TestInstructorsAreAddedToINSTRUCTORS(){
        Instructors instructors = Instructors.getInstructors();

        String expected = "Dolio";

        Instructor testInstructor = (Instructor)instructors.findById(1002);
        String actual = testInstructor.getName();

        Assert.assertEquals(expected,actual);
    }
}
