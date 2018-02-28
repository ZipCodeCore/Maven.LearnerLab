package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington.getInstance().hostLecture(12, 25);
        Student student1 = Students.getInstance().getArray()[0];

        double expected = 5;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }

    @Test
    public void hostLectureTest2() {
        Instructor instructor1 = new Instructor(32342);
        Student student1 = Students.getInstance().getArray()[0];
        ZipCodeWilmington.getInstance().hostLecture(instructor1, 25);

        double expected = 5;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }
}
