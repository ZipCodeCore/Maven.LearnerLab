package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture() {
    Student student1 = Students.getInstance().getStudentArray()[1];
    Instructor joeyBoots = new Instructor(999);

    ZipCodeWilmington.getInstance().hostLecture(joeyBoots, 100);

    double expected = 20;
    double actual = student1.getTotalStudyTime();

    Assert.assertEquals(expected, actual, .05);


    }


    @Test
    public void testHostLecture1() {
        Student student1 = Students.getInstance().getStudentArray()[1];

        ZipCodeWilmington.getInstance().hostLecture(101, 100);

        double expected = 20;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .05);


    }




}