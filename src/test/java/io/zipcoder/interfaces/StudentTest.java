package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student studentTest = new Student(89201944L);

        Class expected = Learner.class;
        Class actual = studentTest.getClass().getInterfaces()[0];

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Student studentTest = new Student(89201944L);

        Class expected = Person.class;
        Class actual = studentTest.getClass().getSuperclass();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn() {
        Student studentTest = new Student(89201944L);

        studentTest.learn(12);

        double expected = 12;
        double actual = studentTest.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }
}