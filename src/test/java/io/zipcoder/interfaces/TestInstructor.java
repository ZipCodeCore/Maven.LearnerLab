package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Instructor instructor = new Instructor(121212, "Leon ");

    @Test
    public void testImplementation() {

        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {

        Assert.assertTrue(instructor instanceof Person);


    }

    @Test
    public void testTeach() {
        Student student = new Student(2, "Jeff");
        instructor.teach(student, 15);

        double expected = 15;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testLecture() {
        Student student = new Student(3, "Claude");
        instructor.teach(student, 30);

        double expected = 30;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

}
