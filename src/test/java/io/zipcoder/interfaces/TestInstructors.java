package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.Instructor;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Instructors;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructorInstance(){
        Instructors instructor = Instructors.getInstance();
        String expected = "Dolio";

        String actual = instructor.findById(1).getName();

        Assert.assertEquals(expected, actual);
    }
}
