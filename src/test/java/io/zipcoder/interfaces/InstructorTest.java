package io.zipcoder.interfaces;

import interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    Instructor testInstructor;

    @Test
    public void testImplementation(){
        testInstructor = new Instructor(32L,"John");

        Assert.assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        testInstructor = new Instructor(32L,"John");

        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void teach() {
        testInstructor = new Instructor(32L,"John");
        Student testStudent = new Student(44L,"Joe");

        testInstructor.teach(testStudent,24);

        double expected = 24;
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void lecture() {
    }
}