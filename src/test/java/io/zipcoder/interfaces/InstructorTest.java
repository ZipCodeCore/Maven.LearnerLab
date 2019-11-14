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
        testInstructor = new Instructor(32L,"John");
        Student student1 = new Student(44L,"Joe");
        Student student2 = new Student(43L,"Sam");
        Student student3 = new Student(41L,"Jack");

        Student[] students = {student1,student2,student3};

        testInstructor.lecture(students,9);

        double expected = 3;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);

    }
}