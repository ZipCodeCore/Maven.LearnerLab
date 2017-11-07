package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    Student student = new Student(001);

    @Test
    public void testImplementation(){
        boolean expected = true;
        boolean actual = student instanceof Learner;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        boolean expected = true;
        boolean actual = student instanceof Person;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn(){
        double expected = 20;
        student.learn(10);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }
}