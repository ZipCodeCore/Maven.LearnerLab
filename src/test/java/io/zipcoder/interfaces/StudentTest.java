package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetTotalStudyTime() {
        Double expected = 10.5;
        Student hardTest = new Student("katrina", 2345, expected);
        Double actual = hardTest.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn() {
        Double expected = 10.5;
        Student hardTest = new Student("katrina", 23487, 0.00);
        hardTest.learn(expected);
        Double actual = hardTest.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudentInstanceOfLearner() {
        Student hardTest = new Student("katrina", 23487, 0.00);
        Assert.assertTrue(hardTest instanceof Learner);
    }

    @Test
    public void testStudentInstanceOfPerson() {
        Student hardTest = new Student("katrina", 23487, 0.00);
        Assert.assertTrue(hardTest instanceof Person);
    }
}

/**Part 3.0 - Test Student

        Create a TestStudent class.
        Create a testImplementation method that asserts that a Student is an instanceof a Learner.
        Create a testInheritance method that asserts that a Student is an instanceof a Person.
        Create a testLearn method that ensures a Student's totalStudyTime instance variable is
 incremented by the specified numberOfHours by invoking the .learn method.*/
