package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void implementationTest() {
        Instructor testInstructor = new Instructor(5);
        Assert.assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        Instructor testInstructor = new Instructor(5);
        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void teachTest() {
        Instructor testInstructor = new Instructor(2);
        Student testStudent = new Student(11);
        testInstructor.teach(testStudent, 32);
        double expected = 32;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.005);
    }

    @Test
    public void lectureTest() {
        Instructor testInstructor = new Instructor(2);
        Student testStudent1 = new Student(11);
        Student testStudent2 = new Student(12);
        Student testStudent3 = new Student(13);
        Learner[] learners = {testStudent1, testStudent2, testStudent3};
        testInstructor.lecture(learners, 60);
        double expected = 20;
        double actual = testStudent2.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.05);
    }


}
