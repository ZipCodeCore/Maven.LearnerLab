package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;
import java.util.HashMap;

public class ZipCodeWilmingtonTest {



    @Test
    public void testHostLecture() {
        ZipCodeWilmington mySchool = ZipCodeWilmington.getInstance();

        mySchool.hostLecture(6, 70);

        HashMap<Student, Double> map = mySchool.getStudyMap();

        for (Student student : map.keySet()) {
            Assert.assertEquals(10, student.getTotalStudyTime(), .01);
        }
    }

    @Test
    public void testHostLecturEducator() {
        ZipCodeWilmington mySchool = new ZipCodeWilmington();

        mySchool.hostLecture(Educator.ROBERTO, 70);

        HashMap<Student, Double> map = mySchool.getStudyMap();

        for (Student student : map.keySet()) {
            Assert.assertEquals(10, student.getTotalStudyTime(), .01);
        }
        Assert.assertEquals(70, Educator.ROBERTO.getTimeWorked(), .01);
    }
}

