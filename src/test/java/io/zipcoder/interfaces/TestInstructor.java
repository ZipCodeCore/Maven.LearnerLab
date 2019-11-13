package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementaion() {
        Instructor instructor = new Instructor(10, "Ann");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(10, "Ann");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(10, "Ann");
        Student student = new Student(9, "Bob");

        instructor.teach(student, 10);
        double actual = student.getTotalStudyTime();
        double expected = 10.0;
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(10, "Ann");
        Learner[] learners = new Learner[3];
        for (int i = 0; i < 3; i++) {
            learners[i] = new Student(i, "Brian" + i);
        }

        instructor.lecture(learners, 9);
        double actual = learners[1].getTotalStudyTime();
        double expected = 3;
        Assert.assertEquals(expected, actual,0 );

    }
}
