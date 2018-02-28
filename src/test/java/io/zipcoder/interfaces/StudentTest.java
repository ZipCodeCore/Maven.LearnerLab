package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private double myTotalStudyTime;
    Student myStudent;

    @Before
    public void setUp() throws Exception {
        myTotalStudyTime = 0;
        myStudent = new Student(1);
    }

    @Test
    public void learnTest() {
        myStudent.learn(10.0);
        double expected = myTotalStudyTime + 10;
        double actual = myStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 001);
    }


}