package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Array;

public class TestZipCodeWilmington {

    ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();

    @Test
    public void testHostLecture() {
        Instructor teacher = (Instructor) Instructors.getInstance().getArray()[0];
        Student student = (Student) Students.getInstance().getArray()[0];

        zipcode.hostLecture(teacher, 280);

        double expected = 10;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }
}
