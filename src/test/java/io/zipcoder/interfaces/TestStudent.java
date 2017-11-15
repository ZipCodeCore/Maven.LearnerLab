package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student ryan = new Student(5);
        Assert.assertTrue(ryan instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student ryan = new Student(5);
        Assert.assertTrue(ryan instanceof Person);

    }

    @Test
    public void testLearn(){
        Student ryan = new Student(5);
        double expected = 10;
        ryan.learn(10);
        double actual = ryan.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);



    }
}
