package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student(1234);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(1234);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(1234);
        student.learn(100.5);
        double expected = 100.5;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

}
