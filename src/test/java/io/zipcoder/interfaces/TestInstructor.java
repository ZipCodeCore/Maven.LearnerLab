package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructor {

    Instructor testInstructor = new Instructor(12);

    @Test
    public void testImplementation() {
        boolean isInstance = testInstructor instanceof Learner;
        Assert.assertTrue(isInstance);
    }

    @Test
    public void testInheritance() {
        boolean isPerson = testInstructor instanceof Learner;
        Assert.assertTrue(isPerson);
    }

    @Test
    public void testTeach() {
        Student testStudent = new Student(40);
        testInstructor.teach(testStudent, 100);
        double expected = 100;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .5);
    }

    @Test
    public void testLecture() {
        Student testStudent1 = new Student(1);
        Student testStudent2 = new Student(2);
        Student[] studentsArray = new Student[2];
        studentsArray[0] = testStudent1;
        studentsArray[1] = testStudent2;
        testInstructor.lecture(studentsArray, 100);
        double expected = 50;
        double actual = testStudent1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .5);

    }


}