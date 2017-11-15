package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Array;

public class TestZipCodeWilmington {

    ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();

    @Test
    public void testHostLecture_Teacher() {
        Instructor teacher = Instructors.getInstance().getArray()[0];
        Student student = Students.getInstance().getArray()[0];

        zipcode.hostLecture(teacher, 280);

        double expected = 10;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testHostLecture_Educators() {
        Educator leon = Educator.Leon;
        Student student = Students.getInstance().getArray()[0];

        zipcode.hostLecture(leon, 280);

        double expected = 10d;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0d);
    }
}
