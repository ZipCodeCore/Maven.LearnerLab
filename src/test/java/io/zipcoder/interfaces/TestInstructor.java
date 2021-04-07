package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(6788772);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(12323123);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(9328423);
        Student student = new Student(7865241);
        double numberOfHours = 12.5;
        instructor.teach(student, numberOfHours);
        double expected = numberOfHours;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.05);

    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(2987342);
        Student student = new Student(837324236);
        Student student1 = new Student(239847493);
        Student student2 = new Student(98374324);
        Student student3 = new Student(32984732);

        Learner[] learners = {student, student1, student2, student3};

        double numberOfHours = 12.5;
        instructor.lecture(learners, numberOfHours);
        double expected = numberOfHours / learners.length;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .05);
    }

}
