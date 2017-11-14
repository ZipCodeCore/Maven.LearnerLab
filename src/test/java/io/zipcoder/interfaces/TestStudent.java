package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {

    Student studentTest;
    @Before
    public void setUp() {
    studentTest = new Student(1);
    }

    @Test
    public void testImplementation() {
        //Given
        boolean expected = true;

        //When
        boolean actual = studentTest instanceof Learner;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        //Given
        boolean expected = true;

        //When
        boolean actual = studentTest instanceof Person;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLearn() {
        //Given
        double expected = 14;

        //When
        studentTest.learn(14);
        double actual = studentTest.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0);
    }

}
