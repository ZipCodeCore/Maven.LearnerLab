package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {

    Student student;

    @Before
    public void setUp(){
        student = new Student("Uncle Bob", 1L);
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
        student.learn(50d);

        Double expectedTime = 50d;
        Double actualTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }

}
