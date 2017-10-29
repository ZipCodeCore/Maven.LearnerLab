package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
        Student aStudent = new Student("Andrew",1);
        Assert.assertTrue(aStudent instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student aStudent = new Student("Andrew",1);
        Assert.assertTrue(aStudent instanceof Person);
    }

    @Test
    public void testLearn() {
        Student aStudent = new Student("Andrew",1);
        double expected = 1.0;
        aStudent.learn(1.0);
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual, 0.01);
    }

}