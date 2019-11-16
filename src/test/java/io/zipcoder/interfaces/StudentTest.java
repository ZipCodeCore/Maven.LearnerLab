package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student(1, "Julia");
    }

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
        student.learn(14.0);
        Assert.assertEquals(14.0, student.getTotalStudyTime(), 0);
    }
}