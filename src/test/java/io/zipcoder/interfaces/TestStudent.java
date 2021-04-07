package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(2, "Billy");

        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student student = new Student(2, "Billy");

        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student = new Student(2, "Joe");

        student.learn(2.5);
        Assert.assertEquals(2.5, student.getTotalStudyTime(), .0001);

        student.learn(2.0);
        Assert.assertEquals(4.5, student.getTotalStudyTime(), .0001);
    }
}