package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.Person;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Student;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudentInstance() {
        Students students = Students.getInstance();
        String expected = "Donald";

        Person donald = students.findById(1);
        String actual = donald.getName();

        Assert.assertEquals(expected, actual);
    }
}
