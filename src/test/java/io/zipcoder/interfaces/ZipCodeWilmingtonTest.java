package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    ZipCodeWilmington zipCodeWilmington=ZipCodeWilmington.getInstance();

    @Test
    public void hostLecturesTest() throws Exception {

        String before=zipCodeWilmington.getStudyTime();
        zipCodeWilmington.hostLectures(1,1000);
        String after=zipCodeWilmington.getStudyTime();

        Assert.assertNotEquals(before,after);
    }

    @Test
    public void hostLectures1Test() throws Exception {

    }

}