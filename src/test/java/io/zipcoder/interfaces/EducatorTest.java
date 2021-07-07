package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void implementationTest(){
        Educator newEducator = Educator.FRANK;

        Assert.assertTrue(newEducator instanceof Teacher);
    }

    @Test
    public void getNumberOfHoursTaught() {
        Educator educator = Educator.FRANK;
        Student newStudent = new Student(7L, "Dan");

        double expected = 10.0;

        educator.teach(newStudent, expected);

        double actual = educator.timeWorked();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void teach() {
        Educator educator = Educator.NICK;
        Student newStudent = new Student(7L, "Dan");

        double expected = 500.0;

        educator.teach(newStudent, expected);

        double actual = newStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void lecture() {
        Educator educator = Educator.SAM;
        Student newStudent1 = new Student(7L, "Dan");
        Student newStudent2 = new Student(8L, "Jack");
        Student newStudent3 = new Student(9L, "Bill");

        Learner[] students = {newStudent1, newStudent2, newStudent3};

        educator.lecture(students, 60.0);

        double expected = 20.0;
        double actual = newStudent3.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
        //------------------------------

        double expected2 = 60.0;
        double actual2 = educator.timeWorked();

        Assert.assertEquals(expected2, actual2, 0);
    }
}