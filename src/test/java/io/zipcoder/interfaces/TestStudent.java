package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementStudentTest(){
        Student studentOne = new Student(1333L, "Joe");

        Assert.assertTrue(studentOne instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        Student studentOne = new Student(1333L, "Joe");

        Assert.assertTrue(studentOne instanceof Person);
    }

    @Test
    public void learnTest(){
        Student studentOne = new Student(1333L, "Joe");
        studentOne.learn(10);
        double actualStudy = studentOne.getTotalStudyTime();
        double expectedStudy = 10;

        Assert.assertEquals(expectedStudy, actualStudy, 0);

    }
}
