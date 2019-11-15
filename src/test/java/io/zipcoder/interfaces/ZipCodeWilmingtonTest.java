package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;
import java.util.HashMap;

public class ZipCodeWilmingtonTest {



    @Test
    public void testHostLecture() {
        ZipCodeWilmington mySchool = new ZipCodeWilmington();

        mySchool.hostLecture(1, 20);

        HashMap<Student, Double> map = mySchool.getStudyMap();

        for (Student student : map.keySet()) {
            Assert.assertEquals(4, student.getTotalStudyTime(), .01);
        }
    }
}

