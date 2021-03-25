package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureByIdTest(){
        ZipCodeWilmington.getInstance().hostLecture(311412L, 100);
        int expectedLecture = 50;

        Assert.assertEquals(expectedLecture, ((Student)(Students.getInstance().findById(212242L))).getTotalStudyTime(), 0.0);
        Assert.assertEquals(expectedLecture, ((Student)(Students.getInstance().findById(121231L))).getTotalStudyTime(), 0.0);
    }
}
