package io.zipcoder.interfaces;

import io.zipcoder.interfaces.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestInstructor {
    Instructor instructor = new Instructor();

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    };

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Student student = new Student();

        instructor.teach(student, 15.0);
        double expected = 15.0;

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0d);
    }

    @Test
    public void testLecture() {
        Student s1 = new Student();
        Student s2 = new Student();
        Learner[] learners = {s1, s2};

        instructor.lecture(learners, 20);
        double expected = 10.0;

        double actual = s1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0d);
    }

}
