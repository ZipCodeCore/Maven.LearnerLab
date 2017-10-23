package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestStudent {
    Student student = new Student(001);


    @Test
    public void testImplementation() {

        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn() {
        double expected = 100.0;

        student.learn(100.0);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0d);
    }

}
