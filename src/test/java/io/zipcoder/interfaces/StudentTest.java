package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void implementationTest(){

        Student newStudent = new Student(10L, "Thing One");

        Assert.assertTrue(newStudent instanceof Learner);
    }

    @Test
    public void inheritanceTest(){

        Student newStudent = new Student(10L, "Thing Two");

        Assert.assertTrue(newStudent instanceof Person);
    }

    @Test
    public void learnTest(){

        Student newStudent = new Student(80L, "Pam");

        double expected = 90.0;
        newStudent.learn(expected);

        double actual = newStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }



}