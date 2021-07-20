package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation () {
        Student student = new Student();

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance () {
        Student student = new Student();

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn () {
        Student student = new Student();
        double expected = 10;

        student.learn(10);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }
}
