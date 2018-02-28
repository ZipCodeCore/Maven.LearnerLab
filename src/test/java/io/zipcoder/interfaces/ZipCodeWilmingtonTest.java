package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/28/18
 */
public class ZipCodeWilmingtonTest {
    @Test
    public void testHostLecture() {
        int totalStudents = Students.getInstance().getCount();
        double expected = 5;
        double lectureHours = totalStudents * expected;

        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();

        zcw.hostLecture(2, lectureHours);

        for (Student s : Students.getInstance().getArray())
            Assert.assertEquals(expected, s.getTotalStudyTime(), 0.01);
    }
}