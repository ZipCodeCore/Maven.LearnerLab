package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest() {
        Student student1 = new Student(23);

        Assert.assertTrue(student1 instanceof Learner);
    }

    @Test
    public void inheritanceTest() {
        Student student1 = new Student(12);

        Assert.assertTrue(student1 instanceof Person);
    }

    @Test
    public void learnTest() {
        Student student1 = new Student(12);
        student1.learn(10);

        double expected = 10.0;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }
}
