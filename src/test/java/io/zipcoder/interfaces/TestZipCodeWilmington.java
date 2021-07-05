package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        ZipCodeWilmington.getInstance().hostLecture(9999, 10.0);
        Student s = Students.getInstance().getPersonList().get(0);
        double expected = 2.0;
        double actual = s.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

}
