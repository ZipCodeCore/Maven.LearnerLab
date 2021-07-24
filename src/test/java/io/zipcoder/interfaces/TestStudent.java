package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(100L, "Biff");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(10L, "Bonk");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn(){
        Student student = new Student(15L, "Meke");

        student.learn(100.00);

        Double expected = 100.00;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
