package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture_Longid_numberOfHours() {
        ZipCodeWilmington newCohort = ZipCodeWilmington.getInstance();
        newCohort.hostLecture(1l, 24);
        double expected = 1.0;
        Student aStudent = (Student) newCohort.students.findById(1);
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .0001);
    }
}
