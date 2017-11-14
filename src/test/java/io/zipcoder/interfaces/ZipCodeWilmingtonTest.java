package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Student someStudent = (Student) zipCodeWilmington.students.findById(10);

        zipCodeWilmington.hostLecture(2, 20);

        double expected = 20.0 / students.getCount();
        double actual = someStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

}