package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        //given
        long id = 1L;
        double numberOfHours = 20.0;
        Double expected = 5.0;
        Students students = Students.getInstance();
        //when
        ZipCodeWilmington.INSTANCE.hostLecture(id, numberOfHours);
        Double actual = ZipCodeWilmington.INSTANCE.getStudyMap().get(students.findByID(1L));
        //then
        Assert.assertEquals(expected, actual);
    }
}
