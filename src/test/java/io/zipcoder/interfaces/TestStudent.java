package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TestStudent {

    Student student;

    @Before
    public void setUp() {
    student = new Student(12345678910L);
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        double expected = 151.0;
        student.getTotalStudyTime();
        double actual = student.learn(expected);
        double delta = 0;
        Assert.assertEquals(expected, actual, delta);

        // had to set an expected amount - called getTotalStudyTime then had to implement the
        // learn method
    }
}

