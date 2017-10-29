package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {




    Student student = new Student(123);

    @Test
    public void learnTest() throws Exception {

        double expected = 12;

        student.learn(12);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.00);
    }

    @Test
    public void getTotalStudyTimeTest() throws Exception {
    }

    @Test
    public void testImplementation() {


        boolean expected = true;

        boolean actual = student instanceof Learner;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {

        boolean expected = true;

        boolean actual = student instanceof Person;

        Assert.assertEquals(expected, actual);
    }

}