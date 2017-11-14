package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington newCohort = new ZipCodeWilmington();
        newCohort.hostLecture(1, 26);
        double expected = 1.0;
        Student aStudent = (Student) newCohort.students.findById(1);
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.001);
    }


}