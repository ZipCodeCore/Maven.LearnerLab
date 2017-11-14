package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student();
        boolean expected = true;
        boolean actual = false;
        if (student instanceof Learner) {
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Student student = new Student();
        boolean expected = true;
        boolean actual = false;
        if (student instanceof Person) {
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn() {
        Student student = new Student();
        student.learn(24);
        double expected = 24;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .001);
    }
}
