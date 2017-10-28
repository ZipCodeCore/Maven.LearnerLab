package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation() {
        Instructor testInstructor = new Instructor(5, "bob");
        boolean expected = true;
        boolean actual = (testInstructor instanceof Teacher);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Instructor testInstructor = new Instructor(5, "bob");
        boolean expected = true;
        boolean actual = (testInstructor instanceof Person);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void teachTest() {
        Instructor testInstructor = new Instructor(5, "bob");
        Student testStudent = new Student(3, "hello");
        double expected = 20;
        testInstructor.teach(testStudent, 20);
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void lectureTest() {
        Instructor testInstructor = new Instructor(5, "bob");
        Student testStudent = new Student(3, "hello");
        Student testStudent2 = new Student(4,"goodbye");
        Student[] studyGroup = {testStudent, testStudent2};
        double expected = 200;
        testInstructor.lecture(studyGroup, 200);
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }
}
