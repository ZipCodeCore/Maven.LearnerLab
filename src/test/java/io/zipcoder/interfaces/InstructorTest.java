package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    private Instructor myTeacher;

    @Before
    public void setUp() throws Exception {
        myTeacher = new Instructor(1);
    }

    @Test
    public void implementationTest() {
        //asserts that instructor is an instance of teacher

    }

    @Test
    public void inheritanceTest() {
        //Instructor is an instance of a person
        long expected = 1;
        long actual = myTeacher.getid();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void teachTest() {
        Student theStudent = new Student(1);
        myTeacher.teach(theStudent, 5);
        double expected = 5;
        double actual = theStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 00l);
    }

    @Test
    public void lectureTest() {
        Student[] students = new Student[2];
        Student student1 = new Student(1);
        students[0] = student1;
        Student student2 = new Student(2);
        students[1] = student2;
        myTeacher.lecture(students, 5);
        double expected = 5 / students.length;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 001);
    }
}