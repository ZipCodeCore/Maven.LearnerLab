package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture() {
        Instructor instructor = new Instructor(223234);

        ZipCodeWilmington.hostLecture(long id, double numberOfHours);
        double expected = 0;
        double actual = instructor.lecture(Students, 25);
        Assert.assertEquals(expected, actual);
    }

}
