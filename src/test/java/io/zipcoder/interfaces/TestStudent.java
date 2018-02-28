package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(134123);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(112334);
        Assert.assertTrue(student instanceof Person);

    }
    @Test
    public void testLearn(){
        Student student = new Student(334556);
        double numberOfHours = 12.5;
        double expected = 12.5;
        student.learn(numberOfHours);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .05);

    }
}
