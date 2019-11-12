package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        Student student = new Student(Long.valueOf(4), "Wes");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(Long.valueOf(4), "Wes");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(Long.valueOf(4), "Wes");
        student.learn(80.5);
        Double actual = student.getTotalStudyTime();
        Double expected = 80.5;
        Assert.assertEquals(expected, actual);
    }
}
