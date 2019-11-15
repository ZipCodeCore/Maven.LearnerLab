package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testImplementation(){
        Educator instructor = Educator.BOOP;
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void teach() {
        Student student = new Student(null,null);
        Double numberOfHours = 3D;
        Educator.BOOP.teach(student, numberOfHours);
        Double expectedHours = 3D;

        Assert.assertEquals(expectedHours, student.getTotalStudyTime());
    }

    @Test
    public void lecture() {
        Instructor instructor = new Instructor(null, null);
        Student student = new Student(null, null);
        Student student2 = new Student(null, null);
        Student student3 = new Student(null, null);
        Learner[] students = {student, student2, student3};
        Double numberOfHours = 9D;
        Double totalHoursSplit = numberOfHours / students.length;
        Educator.BOOP.lecture(students, numberOfHours);

        Assert.assertEquals(totalHoursSplit, student.getTotalStudyTime());
    }
}