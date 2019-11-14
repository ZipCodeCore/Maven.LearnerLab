package io.zipcoder.interfaces;

import interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student testStudent;

    @Test
    public void testLearn() {
        testStudent = new Student(34L,"Joe");

        testStudent.learn(25d);

        double expected = 25.0;
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void testImplementation(){
        testStudent = new Student(34L, "Jack");
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance(){
        testStudent = new Student(34L, "Jack");
        Assert.assertTrue(testStudent instanceof Person);
    }
}