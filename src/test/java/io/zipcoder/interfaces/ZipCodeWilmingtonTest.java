package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class ZipCodeWilmingtonTest {
    ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
    Student student = Students.getInstance().getArray()[0];
    Instructor[] instructor = Instructors.getInstance().getArray();

    @Test
    public void testHostLectureTeacher() {
        long tariq = instructor[0].getId();
        double expected = 1.0;
        zipCodeWilmington.hostLecture(tariq,28.0);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testHostLectureEducator() {
        Educator tariq = Educator.TARIQ;
        double expected = 1.0;
        zipCodeWilmington.hostLecture(tariq,28.0);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);
    }
}


