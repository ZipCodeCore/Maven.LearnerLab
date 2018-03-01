package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void getINSTANCE() {
    }

    @Test
    public void hostLecture() { //expected 10 actual 0
        Student aStudent = Students.getINSTANCE().getArray()[0];
        ZipCodeWilmington.getINSTANCE().hostLecture(Educator.Nhu, 10);
        double expected = 10;
        double actual = aStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual, .01);

    }

    @Test
    public void hostLecture1() {
    }
}


   /** Create a TestZipCodeWilmington class.
        Create a testHostLecture method which ensures that each of the
        Student's totalStudyTime instance variable is incremented by the
        specified numberOfHours upon invoking the hostLecture method.*/