package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void implementationTest () {
        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest () {
        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest () {
        Instructor instructor = new Instructor();
        Student student = new Student();
        double expected = 10;

        instructor.teach(student, 10);

        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void lectureTest () {
        Instructor instructor = new Instructor();
        Student student = new Student();
        Student student1 = new Student();
        Learner[] learners = new Learner[]{student, student1};
        double expected = 5;

        instructor.lecture(learners, 10);
        double actual = student.getTotalStudyTime();
        double actual1 = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
        Assert.assertEquals(expected, actual1, 0);
    }
}
