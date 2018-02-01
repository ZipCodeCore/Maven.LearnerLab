package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student();
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student();
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student();
        double expected=0.123;
        student.learn(expected);
        double actual=student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0001);


    }

}
