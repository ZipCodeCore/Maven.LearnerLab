package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student testStudent = new Student(5, "student");
        boolean expected = true;
        boolean actual = (testStudent instanceof Learner);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Student testStudent = new Student(6, "eleven");
        boolean expected = true;
        boolean actual = (testStudent instanceof Person);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void learnTest() {
        Student testStudent = new Student(3, "hello");
        double expected = 10;
        testStudent.learn(10);
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }
}
