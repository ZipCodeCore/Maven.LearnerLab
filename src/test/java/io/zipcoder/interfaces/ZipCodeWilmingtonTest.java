package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
    Students students = Students.getInstance();
    Educator educator;

    @Test
    public void hostLecture1() {

        zipCode.hostLecture(100L, 20.0);

        Student student = students.getArray()[0];

        double expected = 20.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void hostLecture2() {

        educator = Educator.SAM;
        Student student = students.getArray()[0];

        zipCode.hostLecture(educator, 20.0);

        double expected = 30.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void getStudyMap() {

        educator = Educator.SAM;
        zipCode.hostLecture(educator, 20.0);

        System.out.println(zipCode.getStudyMap().toString());

    }
}