package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {


    @Test
    public void implementationTest() {
        Student testStudent = new Student(7);
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void inheritanceTest() {
        Student testStudent = new Student(7);
        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void learnTest() {
        Student testStudent = new Student(3);
        testStudent.learn(25);
        testStudent.learn(75);
        double expected = 100;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.005);
    }

}
