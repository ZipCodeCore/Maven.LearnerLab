package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

    Student testStudent = new Student(12);

    @Test
    public void testImplementation() {
        boolean isInstance = testStudent instanceof Learner;
        Assert.assertTrue(isInstance);
    }

    @Test
    public void testInheritance() {
        boolean isPerson = testStudent instanceof Learner;
        Assert.assertTrue(isPerson);
    }

    @Test
    public void testLearn(){
        testStudent.learn(14);
        double expected = 14;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .5);
    }
}