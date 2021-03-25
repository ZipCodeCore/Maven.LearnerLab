package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void implementationTest(){
        Instructor newInstructor = new Instructor(76L, "Sam");

        Assert.assertTrue(newInstructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest(){
        Instructor newInstructor = new Instructor(76L, "Sammy");

        Assert.assertTrue(newInstructor instanceof Person);
    }

    @Test
    public void teachTest(){
        Instructor newInstructor = new Instructor(76L, "Sammy");
        Student newStudent = new Student(7L, "Dan");
        double expected = 500.0;

        newInstructor.teach(newStudent, expected);

        double actual = newStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void lectureTest(){
        Instructor newInstructor = new Instructor(76L, "Sammy");
        Student newStudent1 = new Student(7L, "Dan");
        Student newStudent2 = new Student(8L, "Jack");
        Student newStudent3 = new Student(9L, "Bill");

        Learner[] students = {newStudent1, newStudent2, newStudent3};

        newInstructor.lecture(students, 60.0);

        double expected = 20.0;
        double actual = newStudent3.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

}