package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington.getInstance().hostLecture(12, 9);

        for((Learner) Student student: Students.getInstance().getArray()) {
            student.getTotalStudyTime();
        }

        Students.getInstance().getArray()[0].

        double expected = 9;
        Students.getInstance().getArray().
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
