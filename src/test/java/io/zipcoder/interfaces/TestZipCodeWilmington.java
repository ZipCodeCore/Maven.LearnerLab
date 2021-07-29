package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        Students students = Students.getInstance();
        ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();
        //19 students, each with 1 hour study time = 1 hour per student.

        Double expected = 2.0;
        zipcode.hostLecture(101L, 19);
        Double actual = zipcode.getStudyMap().get(students.findById(3L));

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testEnumHostLecture() {
       ZipCodeWilmington zipcodey = ZipCodeWilmington.getInstance();
       Educator leon = Educator.LEON;

       zipcodey.hostLecture(leon, 19.0);
       Double expected = 19.0;
       Double actual =  leon.timeWorked;

       Assert.assertEquals(expected, actual);
    }
}
